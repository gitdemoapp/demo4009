class Test1 extends Test2  //Test1 is child of Test2
{


}


class  Test2 //Test2 is a parent class
{
	void  m1(){
	
	    System.out.println("This is m1 from test2");
	}
}
class InheritanceDemo2 
{
	public static void main(String[] args) 
	{
		 Test1  t1=new Test1();//object creation

		 t1.m1();  //method calling
	}
}
