package com.stackroute.config;

import com.stackroute.controller.EmailController;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.stackroute.emailservice.EmailServiceImpl;
import com.stackroute.model.Email;
import com.stackroute.rabbitmq.domain.EmailDTO;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@Autowired
    private EmailServiceImpl emailService;


        @RabbitListener(queues  =MessageConfiguration.QUEUE)
        public void getEmailDtoFromRabbitMq (EmailDTO emailDto)
        {
            System.out.println(emailDto);
            Email email = new Email();
            email.setEmailId(emailDto.getUseremailId());
            emailService.sendSimpleMail(email);
        }

}


