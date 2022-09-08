class Student 
{
	 
    String  name;//properties

	void login(){//functionalities
	  System.out.println("this is login method ");
	}

	public static void main(String[] args) 
	{

		Student  s1=new Student();//object

		Student  s2=new Student();//object

		s1.name="Raja";

		
			
         s1.login();
		 s2.login();

		

		System.out.println(s1.name+" "+s1.hashCode());
	}
}
