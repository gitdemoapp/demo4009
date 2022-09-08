class Test
{
}
class TestHashCode  extends Test
{

	void  m1(){
	
	}

	public static void main(String[] args) 
	{
		TestHashCode  t1=new TestHashCode();

		int  a=t1.hashCode();

		BankCustomer  b1=new BankCustomer();


		Test t11=new TestHashCode();

		System.out.println(t11.getClass());
	}
}
