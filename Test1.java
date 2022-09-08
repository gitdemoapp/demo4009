class Test2
{
	

    {
	    System.out.println("This is non static block from test2");
	}

}


class Test1 
{
	static{
	    System.out.println("This is static block from test1");
	}
	public static void main(String[] args) throws ClassNotFoundException
	{
		 Test2  t1=new Test2();
		 Test2  t2=new Test2();
		 Test2  t3=new Test2();
		 Test2  t4=new Test2();
		 Test2  t5=new Test2();
	}
}
