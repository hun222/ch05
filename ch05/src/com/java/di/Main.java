package com.java.di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCtx.xml");
		
		Message msg = (Message)ctx.getBean("messageEn");
		msg.sayHello("hoonyeee");
		
		msg = (Message)ctx.getBean("messageKr");
		msg.sayHello("후니");
	}
}
