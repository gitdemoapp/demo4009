import java.util.*;
class Calculator
{
	static Scanner s1=null;

	double  calculateAverage(double a, double b,double c, double d,double e){
		 double  totalMarks=a+b+c+d+e;
		 double average=totalMarks/5;
		 System.out.println("Total marks is ="+totalMarks +" Average marks is ="+average);
	     return average;
	}

	void displayResult(String  name,int rollNumber,String standard,String dob){
		System.out.println("name is ::"+name);
		System.out.println("roll number is ::"+rollNumber);
		System.out.println("standard is ::"+standard);
		System.out.println("date of birth is ::"+dob);
       
		System.out.println("Please enter hindi marks");
		int  m1=s1.nextInt();
		System.out.println("Please enter english marks");
		int  m2=s1.nextInt();
		System.out.println("Please enter sst marks");
		int  m3=s1.nextInt();
		System.out.println("Please enter science marks");
		int  m4=s1.nextInt();
		System.out.println("Please enter math marks");
		int  m5=s1.nextInt();
        double  value=calculateAverage(m1,m2,m3,m4,m5);

		if(value>33){
			System.out.println("you are pass");
		}
		else{
			System.out.println("you are fail");
		}
         
	} 


	public static void main(String[] args) 
	{
		
        s1=new Scanner(System.in);
        System.out.println("Please enter student name");
	    String  name=s1.next();

		System.out.println("Please enter roll number");
	    int  rollNumber=s1.nextInt();

		System.out.println("Please enter your standard");
        String  standard=s1.next();

		System.out.println("Please enter dob");
		String  dob=s1.next();

		Calculator  c1=new Calculator();
		c1.displayResult(name,rollNumber,standard,dob);
         
	}
}
