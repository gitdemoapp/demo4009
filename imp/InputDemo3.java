class Student
{

     static  java.util.Scanner s;
	//we can access non  static members using  object ref
     String sName;
	 int  sRollNumber;
     String sAddress;
	 long sPhoneNumber;
     float averageMarks;
	 String result;
	 float totalMarks;

	 float hindiMarks;
	 float englishMarks;
	 float mathMarks;
	 float scienceMarks;
	 float socialScience;

     void readStudentMarks(){
	     System.out.println("Enter hindi marks :::");
         hindiMarks=s.nextFloat();
		 System.out.println("Enter english marks :::");
	     englishMarks=s.nextFloat();
		 System.out.println("Enter math marks :::");
	     mathMarks=s.nextFloat();
		 System.out.println("Enter science marks :::");
	     scienceMarks=s.nextFloat();
		 System.out.println("Enter social science marks :::");
	     socialScience=s.nextFloat();
	 }

	 void readStudentdata(){
	     System.out.println("Enter student name :::");
		 sName=s.next();
         System.out.println("Enter student rollNumber :::");
		 sRollNumber=s.nextInt();

		 System.out.println("Enter student address :::");
		 sAddress=s.next();

		 System.out.println("Enter student phone number :::");
		 sPhoneNumber=s.nextLong();
	 }

	 static void readCollegeData(){
	     System.out.println("Enter college name :::");

		 Student.collegeName= s.next();

		 System.out.println("Enter college address :::");

		 Student.collegeAddress= s.next();

		 System.out.println("Enter  college Email :::");

		 Student.collegeEmail= s.next();

		 System.out.println("Enter college Phone Number :::");

		 Student.collegePhoneNumber= s.nextLong();
	 }
  //we can access static members using classname | object ref
	 static String collegeName;
	 static String collegeAddress;
	 static String collegeEmail;
	 static long collegePhoneNumber;

	static void  viewCollegeData(){

	     System.out.println("==========college data ==========");
		 System.out.println("collegeName  "+collegeName);
		 System.out.println("collegeAddress  "+collegeAddress);
		 System.out.println("collegeEmail  "+collegeEmail);
		 System.out.println("collegePhoneNumber  "+collegePhoneNumber);

	 }

	 void viewStudentData(){
	     System.out.println("==========student data ==========");
		 System.out.println("sName  "+sName);
		 System.out.println("sRollNumber  "+sRollNumber);
		 System.out.println("sAddress  "+sAddress);
		 System.out.println("sPhoneNumber  "+sPhoneNumber);
	  }

	

	 void  calculateResult(){
		
	      if(studentAverageMarks()<33){
		     System.out.println(sName +"  student failed !!!");
		  }
		  else{
		     System.out.println(sName +"  student passed !!!");
		  }
	 }

	 void studentMarks(){
	     System.out.println("==========student marks  "+sName+"==========");
		 System.out.println("hindiMarks  "+hindiMarks);
		 System.out.println("englishMarks  "+englishMarks);
		 System.out.println("mathMarks  "+mathMarks);
		 System.out.println("scienceMarks  "+scienceMarks);
		 System.out.println("socialScience  "+socialScience);
	 }

	 void  studentTotalMarks(){
	    this.totalMarks=hindiMarks+englishMarks+mathMarks+scienceMarks+socialScience;
		 System.out.println("Total marks for student "+sName +" is "+totalMarks);
	 }

	 float  studentAverageMarks(){
	   averageMarks= this.totalMarks/5;
	   System.out.println("Average marks for student "+sName +" is "+averageMarks);
	   return averageMarks;
	 }

}
class  InputDemo3
{
	public static void main(String[] args) 
	{
		 Student.s =new java.util.Scanner(System.in);
		 Student  s1=new Student();
		 Student  s2=new Student();
         
		 s1.readStudentdata();
		 s1.viewStudentData();
         s1.readStudentMarks();
		 s1.studentTotalMarks();
		 s1.studentAverageMarks();
		 s1.calculateResult();
		 
		 s2.readStudentdata();
		 s2.viewStudentData();
		 s2.readStudentMarks();
		 s2.studentTotalMarks();
		 s2.studentAverageMarks();
		 s2.calculateResult();
		
	}
}
