class Person
{
	String name;
	long adharNumber;
	String address;
	int  id;

	void  eat(){
	    System.out.println("This is eat method from person");
	}

	void  drink(){
	     System.out.println("This is drink method from person");
	}

	void sleep(){
	
	     System.out.println("This is sleep method from person");
	}
}

class Doctor extends Person{

     String  clinicName;
	 String degree;

	 void operate(){
	    System.out.println("This is operate method from doctor");
	 }
}

class Actor extends Person
{
	String studioName;
	String serialName;

	void acting(){
	   
	   System.out.println("This is acting method from actor");
	
	}
}
class InheritanceDemo3 
{
	public static void main(String[] args) 
	{
		 Doctor  p1=new Doctor();
		 p1.eat();
		 p1.drink();
		 p1.sleep();
		 p1.acting();
		 p1.operate();
	}
}
