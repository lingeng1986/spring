package com.lincoln.lab.spring.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestInterceptor1 implements MethodInterceptor {

	public Object invoke(MethodInvocation arg0) throws Throwable {

		Logger logger = LogManager.getLogger(TestInterceptor1.class);

		logger.error("error1");

		System.out.println("interceptor1:"
				+ arg0.getThis().getClass().getName());
		return arg0.proceed();
	}

}
