package com.example.demo.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "one")
public class OneReceiver1 {

    @RabbitHandler
    public void process(String one) {
        System.out.println("Receiver 1: " + one);
    }

}
