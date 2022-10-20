class StringDemo4 
{
	public static void main(String[] args) 
	{
		/*
		  interning of String object

		  Case-1:

		  Case-2:

		*/

		String  s1=new String("java");

		String   s2=s1.intern();



		System.out.println("s1==>"+s1);

		System.out.println("s2==>"+s2);

		String  s3="java";

		System.out.println("s2==s3 ==>"+(s2==s3));


		String  s4=s1.concat("program");

		System.out.println("s4==>"+s4);

		String  s5=s4.intern();

		System.out.println("s5==>"+s5);


		String  s6="javaprogram";

        System.out.println("s5==s6 ==>"+(s5==s6));

	}

}
