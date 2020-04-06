package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class DependencyInjection1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DependencyInjection1Application.class, args);
	Customers c = context.getBean(Customers.class);
	c.display();
	}

}
