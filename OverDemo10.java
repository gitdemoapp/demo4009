class Parent10
{
     int   x=1000;
}

class Child10 extends Parent10
{
     int   x=2000;
}

class OverDemo10 
{
	public static void main(String[] args) 
	{
		Child10  c1=new Child10();

		Parent10  p2=new Child10();


		System.out.println(p2.x);
	}
}
