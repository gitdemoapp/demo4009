
class Customer
{
	void login(){
	   System.out.println("login  ::"+this.hashCode());
	}

}
class TestReturn 
{

      void  m1(){
	      System.out.println("This is non static , void return type , user defined , non parameterized");
	  }


	  String  m2(){
	      System.out.println("This is non static , int return type , user defined , non parameterized");
	  
	     return "java by kayum sir";
	  }


      Customer  registration(){

		  
	       

	        Customer   c1=new Customer();

			return c1;
	  }

	  public static void main(String[] args){
	        TestReturn  obj1=new TestReturn();

			obj1.m1();

			String  a=obj1.m2();

			System.out.println(a);


			Customer x=obj1.registration();

			x.login();

			System.out.println(x.hashCode());
	  }
	
}
