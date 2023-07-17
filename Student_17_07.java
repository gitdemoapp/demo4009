package com.bytecode.corejava.array;

public class Student {

	int rno;
	String name;
	long mobileNumber;
	String emailId;
	
	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static void main(String[] args) {
		
		Student[]   list=new Student[5];
		
		list[0]=new Student();
		list[0].setName("raja");
		list[0].setRno(101);
		list[0].setEmailId("raja@gmail.com");
		list[0].setMobileNumber(11223344L);
		
		list[1]=new Student();
		System.out.println(list[0].getRno());
		System.out.println(list[0].getName());
		System.out.println(list[0].getEmailId());
		System.out.println(list[0].getMobileNumber());
		
		System.out.println(list[1].getRno());
		System.out.println(list[1].getName());
		System.out.println(list[1].getEmailId());
		System.out.println(list[1].getMobileNumber());

	}

}
