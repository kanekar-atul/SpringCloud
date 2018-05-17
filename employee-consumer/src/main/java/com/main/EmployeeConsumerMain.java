package com.main;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.controller.ConsumerController;

@SpringBootApplication
public class EmployeeConsumerMain {
 
	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				EmployeeConsumerMain.class, args);
		
		ConsumerController consumerControllerClient=ctx.getBean(ConsumerController.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();
		
	}
	
	@Bean
	public ConsumerController consumerController() {
		return new ConsumerController();
	}
}



