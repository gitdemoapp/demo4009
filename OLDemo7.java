class Test1
{
}
class Test2 extends Test1
{
}
class OLDemo7 
{
	void m1(Test1  a){
	    System.out.println("Test1--Parent");
	}

	void m1(Test2  b){
	    System.out.println("Test2--Child");
	}

	
	public static void main(String[] args) 
	{
		 OLDemo7   a=new OLDemo7();

		// Test1  b=new Test1();

		//Test2 t2=new Test2();

		Test1  t3= new Test2();

		 a.m1(t3);
	}
}
