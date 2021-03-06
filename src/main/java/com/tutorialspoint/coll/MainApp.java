package com.tutorialspoint.coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
	      @SuppressWarnings("resource")
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("BeansColl.xml");

	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

	      jc.getAddressList();
	      jc.getAddressSet();
	      jc.getAddressMap();
	      jc.getAddressProp();
	   }
}
// auto wirring java-