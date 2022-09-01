package com.bytecode.multi.synch;


//class level locking locking

class Ticket{
	
	static int  availableTicket=10;
	
	synchronized  void ticketBooking(int  requiredTicket) {
		String  name=Thread.currentThread().getName();
		  if(requiredTicket<=availableTicket) {
			  availableTicket=availableTicket-requiredTicket;
			  System.out.println("Hi ... "+name +" your "+requiredTicket +"  tickets booked");
		  }
		  else {
			  System.out.println("Hi ... "+name +"  "+requiredTicket +"  tickets are not available");
		  }
	}
	
	
}

public class ClassLevelLocking {

	public static void main(String[] args) {
		 
		Ticket  ticket=new Ticket();
		
		Runnable r1=()->{
			ticket.ticketBooking(6);
		};
		
		Thread  t1=new Thread(r1);
		Thread  t2=new Thread(r1);
		
		t1.setName("Raja");
		t2.setName("Rani");
		
		t1.start();
		t2.start();
		
		

	}

}
