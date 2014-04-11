package com.lincoln.lab.spring.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TestInterceptor2 implements MethodInterceptor {

	public Object invoke(MethodInvocation arg0) throws Throwable {

		System.out.println("interceptor2:"+arg0.getThis().getClass().getName());
		return arg0.proceed();
	}

}
