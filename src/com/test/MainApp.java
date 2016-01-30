package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {

      AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      
      context.registerShutdownHook();
//      context.destroy();
      
            
//      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld1");
//      obj.getMessage();
//      context.registerShutdownHook();
}
}