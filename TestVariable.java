class TestVariable 
{
	 static int  a=1000;
     int   b=2000;
	public static void main(String[] args) 
	{
         TestVariable  t1=new TestVariable();


		 TestVariable  t2=new TestVariable();

		t1.a=10;
        t1.b=20;

		t1.b=300000;

		System.out.println("t2.a ===>"+t2.a);
		System.out.println("t2.b ===>"+t2.b);
	}
}
