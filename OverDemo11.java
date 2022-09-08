class Parent11
{
	static void m1(){
	   System.out.println("This is m1 method from Parent11");
	}
}

class Child11 extends Parent11
{
	static void m1(){
	   System.out.println("This is m1 method from Child11");
	}
}

class OverDemo11 
{
	public static void main(String[] args) 
	{
		  Parent11  p1=new Parent11();

		  p1.m1();
          Child11  c1=new Child11();

		  c1.m1();

          Parent11  p2=new Child11();

		  p2.m1();

	}
}
