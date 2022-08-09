

	//non static

	//within class outside method | block | constructor  , without static keyword

	//Access ==>by using objecr reference

	//Stduent  s1=new Stduent();

	//objectrefence.variablename
	//s1.studentName="Raja";
	//s1.studentName;


	//static
//within class outside method | block | constructor  , with static keyword

//Student.schoolName;

//Student.schoolName="CSJM";

//Access:  ClassName.staticvariableName;

class Stduent 
{

	String studentName;
	int rollNumber;
	long mobileNumber;

	static String schoolName;
	static String schoolAddress;
	static int schoolCode;

	public static void main(String[] args) 
	{
		Stduent  object1=new Stduent();//object

		Stduent  object2=new Stduent();//object

		Stduent  object3=new Stduent();//object


        object1.studentName="Raja";
		object1.rollNumber=101;
		object1.mobileNumber=734647;

		object2.studentName="Rani";

		object3.studentName="Ramesh";
		object3.rollNumber=102;
		object3.mobileNumber=21343;

		Stduent.schoolName="CSJM University";
		Stduent.schoolAddress="Kanpur";
		Stduent.schoolCode=104;


		System.out.println("student-1 record");

		System.out.println(object1.studentName);

		System.out.println(Stduent.schoolName);

		System.out.println("student-2 record");

		System.out.println(object2.studentName);

		System.out.println(Stduent.schoolName);

		System.out.println("student-3 record");

		System.out.println(object3.studentName);

		System.out.println(Stduent.schoolName);

		System.out.println(object3.rollNumber);

		System.out.println(Stduent.schoolAddress);

		System.out.println(object3.schoolCode);

		System.out.println(object3.mobileNumber);
	}
}
