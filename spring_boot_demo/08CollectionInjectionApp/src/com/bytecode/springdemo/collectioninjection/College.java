package com.bytecode.springdemo.collectioninjection;

import java.util.Map;

public class College {
	private Map<String, String> fucultySubjects;
	private Map<String, String> fucultyPhoneNumbers;

	public Map<String, String> getFucultySubjects() {
		return fucultySubjects;
	}

	public void setFucultySubjects(Map<String, String> fucultySubjects) {
		this.fucultySubjects = fucultySubjects;
	}

	public Map<String, String> getFucultyPhoneNumbers() {
		return fucultyPhoneNumbers;
	}

	public void setFucultyPhoneNumbers(Map<String, String> fucultyPhoneNumbers) {
		this.fucultyPhoneNumbers = fucultyPhoneNumbers;
	}
}
