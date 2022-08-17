package com.stackroute.emailservice;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.stackroute.model.Email;

@Service
public class EmailServiceImpl implements EmailService {

    private JavaMailSender javaMailSender;
    
    @Autowired
    private Email email;
	
	@Autowired
	public EmailServiceImpl(JavaMailSender javaMailSender){
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void sendSimpleMail(Email email) {
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		
		try {
			helper.setTo(email.getEmailId());
			
			helper.setSubject("Login Confrimation Mail");
			
			boolean html = true;
            helper.setText("<div>Hi User\n\n<br>"+"Your WalletBooster Account has been login.<br>"+"\n\n"+"Login time :"+email.getLocalDateTime().now()
			+"<br>"+ "\n\nThanks</div>",html);
		} catch (MessagingException e) {
			e.printStackTrace();
		}		
		javaMailSender.send(message);
	
}
		
		
	}
	



