class Student1 
{

    String  name;

	static String collegeName;

	String  m3(){
		
		return  collegeName;
	}

	String  m1(int   rollNumber){
	
	   return  "[ Student name :: "+name + "||  Roll Number:: "+rollNumber+" || College name ::  "+m3() +"]";
	}

	void  m2(int  rno){
	  
	  String  details= m1(rno);

       System.out.println("Complete student details are ::"+details);
	
	}

	public static void main(String[] args) 
	{
		 Student1.collegeName="AITH";

		   String  s1;
		   int  r1;

           java.util.Scanner sc=new java.util.Scanner(System.in);
          System.out.println("Please enter number student :: ");

		 int  n= sc.nextInt();


          for ( int  i=1;i<=n ; i++)
           {
         
          System.out.println("Please enter student name :: ");

		  s1= sc.next();

		  System.out.println("Please enter student roll number :: ");

		  r1= sc.nextInt();
         
          Student1  obj1=new Student1();
		  obj1.name=s1;
		  obj1.m2(r1);
        
		}
	}
}
