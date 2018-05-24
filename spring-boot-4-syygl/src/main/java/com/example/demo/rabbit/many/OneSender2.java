package com.example.demo.rabbit.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneSender2 {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(int i) {
		String context = "spirng boot one queue"+" ****** "+i;
		System.out.println("One - Sender2 : " + context);
		this.rabbitTemplate.convertAndSend("one", context);
	}

}