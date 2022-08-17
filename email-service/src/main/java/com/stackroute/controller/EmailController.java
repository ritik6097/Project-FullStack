package com.stackroute.controller;

import com.stackroute.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.emailservice.EmailServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/login")
@Api(value="email service",description = "email service controller")
public class EmailController {
	
	private Logger logger = LoggerFactory.getLogger(EmailController.class);
	
	@Autowired
	private EmailServiceImpl emailservice;
	
	
	@RequestMapping(value="/{emailId}/home",method=RequestMethod.GET)
	public void sendMail(@PathVariable String emailId){
		try{
//		emailservice.sendSimpleMail(emailId);

			
		} catch( Exception e ){
			
			logger.info("Error Sending Email: " + e.getMessage());
		}
		
	
	}

}
