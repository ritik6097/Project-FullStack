package com.stackroute.emailservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;

import com.stackroute.model.Email;

@Service
public class EmailServiceImpl implements EmailService {

	private Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
	private JavaMailSender javaMailSender;

	@Autowired
	private Email email;

	@Autowired
	public EmailServiceImpl(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void sendSimpleMail(Email email) {

		SimpleMailMessage mail = new SimpleMailMessage();
		System.out.println("===============>>method service");
		try {
			mail.setSubject("Login Confrimation Mail");
			mail.setText("Hi User\n\n" + "Your WalletBooster Account has been login." + "\n\n" + "Login time :" + email.getLocalDateTime().now()
					+ "\n\nThanks");
			mail.setTo(email.getEmailId());
			System.out.println("===============>> service try");

		} catch (Exception e) {
			logger.info("Error Sending  Email: " + e.getMessage());
		}
		this.javaMailSender.send(mail);
		System.out.println(mail);
	}
}



