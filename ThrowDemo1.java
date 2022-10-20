/*
    Exception handling:
	-------------------

	throw:
	------
      


class  ThrowDemo1
{
	public static void main(String[] args) 
	{
		System.out.println(10/0);
		
		Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ThrowDemo1.main(ThrowDemo1.java:14)
	}
}

*/

class  ThrowDemo1 extends RuntimeException  //CheckedException
{
	
	ThrowDemo1(String  message){
	      super(message);
	}

}
