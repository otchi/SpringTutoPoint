package com.tutorialspoint.helloworld;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	  public static void main(String[] args) {
		  @SuppressWarnings("resource")
		AbstractApplicationContext context = 
	             new ClassPathXmlApplicationContext("BeansHW.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      obj.setMessage("cc");
	   /*   obj.getMessage();
	      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
	      obj1.getMessage();*/
	      context.registerShutdownHook();
	      // this method are not called to scope prototype
	   }

}
