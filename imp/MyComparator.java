package com.bytecode.collection.imp;

import java.util.Comparator;

public class MyComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		
		
		/*if(o1.getCustomerid()<o2.getCustomerid()) {
			return 1;
		}
		else if(o1.getCustomerid()>o2.getCustomerid()) {
			
			return -1;
		}
		else
		return 0;*/
		
		//return o1.getCustomerid()<o2.getCustomerid()?-1:o1.getCustomerid()>o2.getCustomerid()?1:0;
	
	  //return  -(o1.getCustomerid()-o2.getCustomerid());
		
		return o2.getDate().compareTo(o1.getDate());
	}

}
