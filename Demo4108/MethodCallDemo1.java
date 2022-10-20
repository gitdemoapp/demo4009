class MethodCallDemo1 
{

	void  m1(){
     MethodCallDemo1  obj1=new MethodCallDemo1();
		 obj1.m2();
		
	    System.out.println("This is m1 method "+this.hashCode());
		 MethodCallDemo1  obj2=new MethodCallDemo1();
		 obj2.m3();
	}

	void  m2(){
    MethodCallDemo1  obj1=new MethodCallDemo1();
		 obj1.m3();
		System.out.println("This is m2 method "+this.hashCode());
	
	}

	void  m3(){
	    
	  System.out.println("This is m3 method "+this.hashCode());
	
	}

	public static void main(String[] args) 
	{
		MethodCallDemo1  obj1=new MethodCallDemo1();

		obj1.m1();
	}
}
