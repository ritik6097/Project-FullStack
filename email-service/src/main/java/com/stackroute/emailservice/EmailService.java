package com.stackroute.emailservice;

import com.stackroute.model.Email;
import org.springframework.http.HttpStatus;

public interface EmailService {
	
	public void sendSimpleMail(Email email);

}
