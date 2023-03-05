package com.bytecode.interface1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c1=context.getBean("audiImpl", Car.class);
		c1.maxSpeed();
		c1.carService();
		context.close();

	}

}
