package com.stackroute.rabbitmq;


import com.stackroute.entity.User;
import com.stackroute.service.MyUserDetailsService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class MessageConsumer {

    @Autowired
    private MyUserDetailsService userDetailsService;


    @RabbitListener(queues = RMQConfig.QUEUE)
    public void consumeMessage(User user){
        System.out.println("Got email and password" + user.toString());

        userDetailsService.saveUser(user);
    }
}
