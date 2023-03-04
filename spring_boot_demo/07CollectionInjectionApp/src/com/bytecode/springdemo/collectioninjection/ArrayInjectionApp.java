package com.bytecode.springdemo.collectioninjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayInjectionApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student obj=context.getBean("st1", Student.class);
		System.out.println(obj);
		context.close();

	}

}
