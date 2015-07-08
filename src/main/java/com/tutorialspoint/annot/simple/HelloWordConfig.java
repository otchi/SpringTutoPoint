package com.tutorialspoint.annot.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorialspoint.helloworld.HelloWorld;

@Configuration
public class HelloWordConfig {
	@Bean
	 public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
	/*----------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		   @SuppressWarnings("resource")
		ApplicationContext ctx = 
		   new AnnotationConfigApplicationContext(HelloWordConfig.class);
		   
		   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

		   helloWorld.setMessage("Hello World!");
		   helloWorld.getMessage();
		}
}
