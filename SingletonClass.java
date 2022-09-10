class TestSingleton
{

    static TestSingleton  obj=null;

   static TestSingleton m1(){

	         if(obj==null){
			     obj=new TestSingleton();
			 }

          return obj;
	}

	private TestSingleton(){
	
	}
}
class SingletonClass 
{
	public static void main(String[] args) 
	{
		
       TestSingleton  obj1= TestSingleton.m1();

	   System.out.println("obj1.hashCode() ::"+obj1.hashCode());

	    TestSingleton  obj2= TestSingleton.m1();

	   System.out.println("obj2.hashCode() ::"+obj2.hashCode());

	    TestSingleton  obj3= TestSingleton.m1();

	   System.out.println("obj3.hashCode() ::"+obj3.hashCode());


	}
}
