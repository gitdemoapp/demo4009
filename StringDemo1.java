/*
    String handling:
	---------------
	String  s="java";

	String  s1=new String("java");  runtime operation  | method calling







*/

class  StringDemo1
{
	public static void main(String[] args) 
	{
		final String  s1="java";

		System.out.println("s1 =>"+s1);

		String  s2=s1+"program";

		//String  s2="java"+"program";//compiletime ==>SCP

		System.out.println("s2 =>"+s2);

		String  s3="javaprogram";

		System.out.println("s2==s3 =>"+(s2==s3));


		


	}
}
