package com.stackroute.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Email {
	
	private LocalDateTime localDateTime;

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Email() {
		super();
		this.localDateTime = localDateTime.now();
	}

	public Email(LocalDateTime localDateTime) {
		super();
		this.localDateTime = localDateTime;
	}

}
