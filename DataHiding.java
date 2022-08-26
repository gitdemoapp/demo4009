/*
    Object oriented programming concepts:

	class
	object
	method
	variables

	data hiding

	abstraction
	encapsulation
	tightly encapsulated class

	HAS-A relationship

	IS-A relationship (Inheritance)

	Method signature
	polymorphism

	     Overloading
		 Overrding
		 method hiding
    Block
	   Instance block
	   static block
	  
	Constructor

	Coupling 
	Cohesion


	=============================================

	
	class  Student{
	
	   name 

	   
	}

*/


class Account
{
	private int  balance;  //non static variable

	int getBalance(){
	
	  return balance;
	}

	 void setBalance(int   bal){
	
	   this.balance=bal;
	}
}

class DataHiding
{
	public static void main(String[] args){
	    
		Account  a1=new Account();

		a1.setBalance(1000000);

		int a=a1.getBalance();

	    System.out.println(a);

		Account  a2=new Account();

		a2.setBalance(2000000);

		int b=a2.getBalance();

	    System.out.println(b);
	}
}