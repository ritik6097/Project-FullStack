package com.stackroute.emailservice;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.stackroute.controller.EmailController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.stackroute.model.Email;

@Service
public class EmailServiceImpl implements EmailService {

	private Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
    private JavaMailSender javaMailSender;
    
    @Autowired
    private Email email;
	
	@Autowired
	public EmailServiceImpl(JavaMailSender javaMailSender){
		this.javaMailSender = javaMailSender;
	}

	public void sendSimpleMail(Email email) {
		SimpleMailMessage mail = new SimpleMailMessage();

		try {
//			mail.setFrom("admin@spring.io");
			mail.setSubject("Login Confrimation Mail");
			mail.setText("Hi User\n\n" + "Your WalletBooster Account has been login." + "\n\n" + "Login time :" + email.getLocalDateTime().now()
					+ "\n\nThanks");
			mail.setTo(email.getEmailId());
		} catch (Exception e){
			logger.info("Error Sending  Email: " + e.getMessage());
		}
		this.javaMailSender.send(mail);

    }
}
	



