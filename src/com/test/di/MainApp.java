package com.test.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans-inheritance.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans-di.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.sayMessage();
		
		HelloWorldCon objB = (HelloWorldCon) context.getBean("helloWorldCon");
		
		objB.sayMessage();
		
	}
}