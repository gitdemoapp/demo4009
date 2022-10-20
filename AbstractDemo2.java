abstract class AbstractDemo2
{

	abstract void  m1();

	abstract void  m2();

	abstract void  m3();

	 void  m4(){
	 
	 }

	 void  m5(){
	 
	 }

	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}

class AbsChild extends AbstractDemo2
{
     void  m3(){
	
	}

	 void  m2(){
	
	}

	 void  m1(){
	
	}
}


