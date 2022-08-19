package com.stackroute.rabbitconfig;

import com.stackroute.custommessage.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {

    @Autowired
    private RabbitTemplate template;

    // @RabbitListener(queues ="MQConfig.QUEUE")

    public String publishMessage(CustomMessage message){

        template.convertAndSend(MQconfig.EXCHANGE,MQconfig.ROUTING_KEY,message);
        return ("message published");
    }
}
