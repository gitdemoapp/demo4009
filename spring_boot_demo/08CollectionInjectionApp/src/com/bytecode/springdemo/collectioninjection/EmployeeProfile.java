package com.bytecode.springdemo.collectioninjection;

import java.util.Properties;

public class EmployeeProfile {
     private Properties empDesg;

	public Properties getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(Properties empDesg) {
		this.empDesg = empDesg;
	}
}
