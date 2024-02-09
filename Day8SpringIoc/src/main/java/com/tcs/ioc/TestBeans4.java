package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans4 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans4.xml");
		context.registerShutdownHook();//it will stop main so that container gives chance to execute container destroy method.
		Object obj=context.getBean("b");//it fetch b object from container
		B b=(B)obj;
		b.other();
		C c=(C)context.getBean("c");//when we call getbean it creates object in container
		c.other();
        System.out.println(context.isPrototype("a"));
        System.out.println(context.isSingleton("a"));//only one instance is singleton 
	}

}

