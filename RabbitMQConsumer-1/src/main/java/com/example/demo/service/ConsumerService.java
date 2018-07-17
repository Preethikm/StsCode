package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class ConsumerService {
	
	
	@RabbitListener(queues="${javainuse.rabbitmq.queue}")
	public void read(Employee consumerModel)
	{
		System.out.println(consumerModel.getEmpId());
	}

}
