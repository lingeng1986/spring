package com.lincoln.lab.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lincoln.lab.spring.service.HelloService;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("*.xml");

		HelloService service = (HelloService) context.getBean("helloService");

		service.sayHelloTo("lincoln");
	}

}
