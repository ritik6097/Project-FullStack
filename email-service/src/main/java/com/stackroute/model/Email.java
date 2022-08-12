package com.stackroute.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;

@Component
public class Email {
	
	@ApiModelProperty(notes = "User EmailId For Email")
	private String emailId;
	
	@ApiModelProperty(notes = "LocalDateTime For Email")
	private LocalDateTime localDateTime;

	public Email() {
		super();
		this.localDateTime=localDateTime.now();
		// TODO Auto-generated constructor stub
	}

	public Email(String emailId, LocalDateTime localDateTime){
		super();
		this.emailId = emailId;
		this.localDateTime = localDateTime;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}



}
