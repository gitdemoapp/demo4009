/*
   Checked and Unchecked exception--

   System.out.println(10/0);//Implicitly--->object creation --->throw that object

   Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExcThrowDemo1.main(ExcThrowDemo1.java:8)

		===========================================
        throw new ArithmeticException("/ by zero");

		Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExcThrowDemo1.main(ExcThrowDemo1.java:8)
*/

class SleepingException extends RuntimeException//Checked Exception
{
      SleepingException(String  msg){
	      super(msg);
	  }
}
class ExcThrowDemo1 
{
	public static void main(String[] args) 
	{
		 //1. defaultExceptionHandler -->object--->throw --with some information

		// throw new ArithmeticException("/ by zero");//Explicitly

                 try{

		         throw new SleepingException("you are sleeping in classroom!");//-->Throwable -->ArithmeticException
			
			     }
			     catch(SleepingException  se){
			
			     }
		
	}
}
