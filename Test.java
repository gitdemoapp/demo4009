/*

 This is multi-line comment

   Types of variables:
   -------------------

   purpose and positions:
   ---------------------

   1) static variable====================>
   2)non static | instance variable
   3)local variable


   class Test{
   
         static  int  x;

		 int   y;

		 void  method1(){

             Test.x=200;

			 Test t1=new Test();

			 t1.y=100;
		        
				int   z;  local variable
		 
		 }
   
   }

   


*/


//  This is single line comment


class Test
{
	static int  x=100;

	 int  y=200;

	public static void main(String[] args){
	        
            Test.x=2000;

			Test  obj1=new Test();

			Test  obj2=new Test();

			Test  obj3=new Test();

			obj1.y=1000;


			System.out.println("obj1.x  "+obj1.x);
			System.out.println("obj2.x "+obj2.x);

			System.out.println("obj1.y "+obj1.y);
			System.out.println("obj2.y "+obj2.y);

			System.out.println("obj3.x "+obj3.x);
			System.out.println("obj3.y "+obj3.y);


	}
}