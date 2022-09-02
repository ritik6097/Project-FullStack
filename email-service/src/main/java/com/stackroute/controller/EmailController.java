package com.stackroute.controller;

import com.stackroute.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stackroute.emailservice.EmailServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//@CrossOrigin("*")
@RestController
@RequestMapping("/login")
@Api(value="email service",description = "email service controller")
public class EmailController {
	
	private Logger logger = LoggerFactory.getLogger(EmailController.class);
	
	@Autowired
	private EmailServiceImpl emailservice;

	@Autowired
    private Email email;

	@RequestMapping(value="/{emailId}",method=RequestMethod.GET)
	public void sendMail(@PathVariable String emailId){

		email.setEmailId(emailId);
  System.out.println("===============>>.");
		try{
		emailservice.sendSimpleMail(email);
			System.out.println("===============>>try.");
			
		} catch( Exception e ){
			
			logger.info("Error Sending Email: " + e.getMessage());
		}
		
	
	}

}
