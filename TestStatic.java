class TestStatic 
{

    static   TestStatic  obj2=null;
	static TestStatic  variable1=null;

	public void method1(){
		method4();
		System.out.println("non static method-1 "+this.hashCode());
	}

	public void method4(){
		System.out.println("non static method-4 "+this.hashCode());
	}

	public static void method2(){
		
		   variable1.method4();
		System.out.println("static method-2");
	}

	public static void method3(){
      
		obj2.method4();
		System.out.println("static method-3");
	}

	public static void main(String[] args) 
	{
		
		variable1 =new TestStatic();

		obj2=new TestStatic(); 


		System.out.println("obj2.hashCode() "+obj2.hashCode());

		System.out.println(" variable1.hashCode() "+variable1.hashCode());

		method3();
		TestStatic.method2();
		
      

		variable1.method1();

		variable1.method3();

		

		obj2.method1();

	}
}
