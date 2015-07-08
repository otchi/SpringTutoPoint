package com.tutorialspoint.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	  @SuppressWarnings("resource")
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("BeansIoC.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditor");

	      te.spellCheck();
	   }
}
