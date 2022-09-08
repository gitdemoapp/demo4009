abstract class Parent8
{
	abstract void m1();

	void  m2(){
	    System.out.println("This is implementation of m2 method");
	}
}

abstract class Child8 extends Parent8
{
	abstract void  m1();

}
class Child88 extends Child8
{
    void m1(){
	   System.out.println("This is implementation of m1 method");
	}
}
class OverDemo8 
{
	public static void main(String[] args) 
	{
		 Child88  obj1=new Child88();
		 obj1.m1();
		 obj1.m2();
	}
}
