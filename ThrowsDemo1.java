/*
    Exception handling:
	------------------
    Introduction
	Default Exception handler
	Runtime Stack mechanism
	Exception hierachy
	      Checked Exception
		  Unchecked Exception
		      Partially Checked 
			  Fully Checked
    customized exception handling using try and catch block
	control flow in try catch
	try with multiple catch block
	finally block
	control flow in try catch finally
	difference between final , finally and finalize
	different combinations of try catch finally
	throw statement
	throws statement
	exception keyword summary
	    try  --risky code
		catch--handling code
		finally--cleanup code
		throw--  to handover our created eexception to JVM
		throws--to convince the compiler
     
	 Some important exceptions
	 Our Customized exception

	 1.7 version enhancments in java related to exception handling
	 -------------------------------------------------------------

	 1) try with multi catch block
		

*/
class  ThrowsDemo1 
{

	public static void main(String[] args) 
	{
		try{
		 System.out.println( Integer.parseInt(args[0]) /Integer.parseInt(args[1])); 
		}
		catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException |Exception e){
		    e.printStackTrace();
		}

		catch(Exception e){
		     e.printStackTrace();
		}

	}
}
