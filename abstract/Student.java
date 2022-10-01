class Student
{

//   datatype  variablename;

	static String  collegeName;

	String  studentName;
	int rollNumber;

	void register(){
	   
	     System.out.println("Hi..."+studentName +"  you are registered "+this.hashCode());
	     System.out.println("Your name is ::"+studentName);
		 System.out.println("Your college name  is ::"+collegeName);
		 System.out.println("Your roll number  is ::"+rollNumber);

		 System.out.println("============================================");
	}

	/*
	
	  void  methodName(){
	  
	  
	  }

	*/

	void login(){
	
	
	}

	void logout(){
	
	}

     public static void main(String[] args){

		 //ClassName  var=new ClassName();
	 
	    Student   s1=new Student();//object creation

		Student   s2=new Student();

	    Student   s3=new Student();

		s1.studentName="Raja";//variable initialization

		s3.studentName="Rani";

		s2.studentName="Ramesh";

		s1.collegeName="PSIT";

		s1.rollNumber=101;

        s2.rollNumber=102;

        s3.rollNumber=103;


		

		s1.register();//method calling 

		s2.register();//method calling 

		s3.register();//method calling 
	 
	 }
}

