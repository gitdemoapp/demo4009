/*

   Same name of class 
   body same as method
   execution same as nin static block
   we can not use return type with constructor
   allowed modifiers for constructor are public , default , protected , private

    ConstructorDemo2(){
	
	}

*/

class ConstructorDemo2 
{

	 ConstructorDemo2(){
	   System.out.println("This is constructor");
	}

	public static void main(String[] args) 
	{
		ConstructorDemo2  obj1=new ConstructorDemo2();

		ConstructorDemo2  obj2=new ConstructorDemo2();

		ConstructorDemo2  obj3=new ConstructorDemo2();

		
	}
}


