abstract class TestCons5 
{
    TestCons5(){
	    System.out.println("Zero param constructor from Parent");
	}
}
class ConsDemo5  extends TestCons5
{
	ConsDemo5(){

	    System.out.println("Zero param constructor");
	}

	public static void main(String[] args) 
	{
		 ConsDemo5  obj1=new ConsDemo5();
	} 
}
