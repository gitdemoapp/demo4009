class Employee 
{

    /*
	
	  1. if the value of a variable is not changing from object to object 
	  then we should go for static variable.

	  2. At the time of class loading static variable will get the memory within 
	     method area as the part of class.

		 class load--->method area

	  3. class loads only at once thats why static var will get memory only once.

	  4. we can access static variable by using class name.

	  Student.collegeName

	  5. copy of static var will be shared with eevery object so we can access static
	  var with help of object reference also.

      Student  s1=new Student();
	  s1.collegeName


	  6. we can access static var directly without any reference but only within the 
	  same class.

	

	  collegeName

	  7. if we are not initializing static variable then JVM will initialize default
		value at runtime.

      8.  static variable creates at the time of class laoding and destroys at the time 
	  of class unloading that why we can say nature of static variable depends on class.



  java ClassName:

      1. JVM start
	  2. main thread creation
	  3. locate class file
	  4. load the class file ---->static variable creation
	  5. main method exection
	  6. class unloading---->static variable destruction
	  7. main thread destroy
	  8. JVM shutdown
	*/

	static String companyName;

	public static void main(String[] args) 
	{

        Test  t1=new Test();
        System.out.println(t1.a);

		Test.a=2000;

		System.out.println(t1.a);

		Test.a=3000;

		System.out.println(t1.a);
	}
}

class Test
{
	static int  a;
}
