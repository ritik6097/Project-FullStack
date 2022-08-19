package com.stackroute;

import com.icegreen.greenmail.configuration.GreenMailConfiguration;
import com.icegreen.greenmail.junit5.GreenMailExtension;
import com.icegreen.greenmail.util.ServerSetupTest;
import com.stackroute.emailservice.EmailServiceImpl;
import com.stackroute.model.Email;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmailServiceImplTests {

    @Autowired
    private EmailServiceImpl esi;
    @RegisterExtension
    static GreenMailExtension greenMail = new GreenMailExtension(ServerSetupTest.SMTP)
            .withConfiguration(GreenMailConfiguration.aConfig().withUser("duke", "springboot"))
            .withPerMethodLifecycle(false);

    @Autowired
    private JavaMailSender javaMailSender;


    @Test
    public void succussfullMail() throws MessagingException {
        Email email = new Email("user@gmail.com", LocalDateTime.now());

        esi.sendSimpleMail(email);
        MimeMessage[] receivedMessages = greenMail.getReceivedMessages();
        assertEquals(1, receivedMessages.length);
        MimeMessage current = receivedMessages[0];
        assertEquals(LocalDateTime.now(),email.getLocalDateTime().now());
        assertEquals("user@gmail.com",email.getEmailId());
        assertEquals(1,current.getAllRecipients().length);
        assertEquals(email.getEmailId(),current.getAllRecipients()[0].toString());


}

}
