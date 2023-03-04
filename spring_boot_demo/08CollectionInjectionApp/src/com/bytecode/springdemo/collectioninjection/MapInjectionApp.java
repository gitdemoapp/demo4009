package com.bytecode.springdemo.collectioninjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapInjectionApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//College user=classPathXmlApplicationContext.getBean("college1", College.class);
		EmployeeProfile user=classPathXmlApplicationContext.getBean("ep", EmployeeProfile.class);
		System.out.println(user.getEmpDesg());
		
		classPathXmlApplicationContext.close();
	}

}
