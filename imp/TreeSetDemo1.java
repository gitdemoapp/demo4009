package com.bytecode.collection.imp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) throws ParseException {
		
		/*Comparator<Customer> comparator=new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				  
				 return o1.getDate().compareTo(o2.getDate());
			}
			
		};*/

		Comparator<Customer> comparator=(c1,c2)->{
			return c2.getDate().compareTo(c1.getDate());
			
		};
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Customer customer1 = new Customer(501, "ABC", "Kanpur", dateFormat.parse("15/11/2022"));
		Customer customer2 = new Customer(104, "PQR", "Allahabad", dateFormat.parse("15/12/2022"));
		Customer customer3 = new Customer(100, "XYZ", "Varanasi", dateFormat.parse("15/01/2022"));
		Customer customer4 = new Customer(601, "BCA", "Mumbai", dateFormat.parse("01/10/2022"));
		Customer customer5 = new Customer(701, "MCA", "Kolkata", dateFormat.parse("01/01/2022"));

		TreeSet<Customer> customers = new TreeSet<Customer>(comparator);

		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);

		System.out.println(customers);

	}

}
