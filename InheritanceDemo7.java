class Comapny
{
	String name;
	String address;
	int regNumber;
	long phoneNumber;

}
class Employee  extends Comapny
{
	String ename;
	String edesg;
	int  eid;
	double esalary;
	String dept;

	void login(){
	
	}

	void registration(){
	
	}

	void viewPaySlips(){
	
	}

	void sentPaySlipsOnEmail(){
	
	}

	void viewOrgPolicy(){
	
	}

	void applyForLeave(){
	
	}

	void  viewProfileDetails(){
	
	
	}


}

class Manager extends Employee
{
    String managerId;
    
}

class HR  extends Employee
{

}

class Admin  extends Employee
{

}

class InheritanceDemo7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
