package com.bytecode.springdemo.collectioninjection;

import java.util.Arrays;

public class Student {
	private int marks[];
	private String names[];

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Stduent [marks=" + Arrays.toString(marks) + ", names=" + Arrays.toString(names) + "]";
	}
	
	
}
