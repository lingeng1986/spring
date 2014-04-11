package com.lincoln.lab.spring.service;

public class HelloServiceImpl implements HelloService {

	public void sayHelloTo(String name) {
		System.out.println("hello," + name);
	}

}
