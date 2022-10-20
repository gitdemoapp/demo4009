class ReturnTypeMethodDemo1 
{

    
	String  m1(  ){
	   System.out.println("this is void return type method");

	   return "Kayum";
	}

	public static void main(String[] args) 
	{
		 ReturnTypeMethodDemo1  obj1=new ReturnTypeMethodDemo1();

		 String  a=obj1.m1();

         System.out.println("return value is :: "+a);
	}
}
