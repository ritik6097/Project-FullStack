package com.stackroute.model;

import java.time.LocalDateTime;

import lombok.*;
import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Email {
	
	@ApiModelProperty(notes = "User EmailId For Email")
	private String emailId;
	
	@ApiModelProperty(notes = "LocalDateTime For Email")
	private LocalDateTime localDateTime;

}
