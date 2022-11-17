package com.bytecode.collection.imp;

import java.util.Date;

public class Customer {

	private int customerid;
	private String customerName;
	private String customerAddress;
	private Date date;

	public Customer(int customerid, String customerName, String customerAddress,Date date) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.date = date;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", date=" + date + "]";
	}
	

}
