package com.stackroute.RabbitMq;

import com.stackroute.RabbitMq.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class MessagePublisher {

    @Autowired
    private RabbitTemplate template;

    // @RabbitListener(queues ="MQConfig.QUEUE")

    public String publishMessage(CustomMessage message){

        template.convertAndSend(RabbitMqConfig.EXCHANGE,RabbitMqConfig.ROUTING_KEY,message);
        return ("message published");
    }
}
