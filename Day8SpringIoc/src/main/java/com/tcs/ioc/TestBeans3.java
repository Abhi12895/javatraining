package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans3 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
		context.registerShutdownHook();//it will stop main so that container gives chance to execute container destroy method.
		Object obj=context.getBean("radius");//it fetch
		Radius r=(Radius)obj;
		
		
		
        System.out.println(context.isPrototype("radius"));
        System.out.println(context.isSingleton("circle"));//only one instance is singleton 
	}

}

