package com.tutorialspoint.eventhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>{

	
	public void onApplicationEvent(ContextStartedEvent evant) {
		// TODO Auto-generated method stub
		System.out.println("ContextStartedEvent Received");
	}

}
