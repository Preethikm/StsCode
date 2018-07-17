package com.cg.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

public class RabbitMqConsumer {
	@Component
	public class Consumer {

		@RabbitListener(queues="${javainuse.rabbitmq.queue}")
	    public void recievedMessage(String msg) {
	        System.out.println("Recieved Message: " + msg);
	    }
	}

}
