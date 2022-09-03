/*
  

*/
class Parent{

}

class Child extends Parent
{

}

class OLTest5
{
	void  m1(Parent   sb){
	   System.out.println("Parent");
	}

	void  m1(Child   s){
	   System.out.println("Child");
	}
}


class OLDemo5 
{

	public static void main(String[] args) 
	{
       OLTest5  obj=new OLTest5();
		obj.m1(null);
		
	}
}
