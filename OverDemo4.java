//In case of private modifier
//in case of final modifier
//we can increase the scope but we can not decrease the scope

class OverTest4
{
	//overridden method
    void m1(){
	   System.out.println("This is m1 method from OverTest4");
	}
}

class  OverDemo4 extends OverTest4
{
	final void m1(){
	   System.out.println("This is m1 method from OverTest4");
	}

	public static void main(String[] args) 
	{
		OverDemo4  c1=new OverDemo4();
		c1.m1();
	}
}
