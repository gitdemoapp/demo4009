package com.bytecode.springdemo.collectioninjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetInjectionApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=classPathXmlApplicationContext.getBean("user1", User.class);
		System.out.println(user.getPhones());
		classPathXmlApplicationContext.close();
	}

}
