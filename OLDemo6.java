class OLTest6
{
	void m1(int... a){
	    System.out.println("var arg method... means it can take any number of arguments");
	}

	void m1(int  a,int  b){
	     System.out.println("general method this one will take only one argument");
	}
}
class OLDemo6 
{
	public static void main(String[] args) 
	{
		OLTest6  obj=new OLTest6();
		obj.m1(10,20);
	}
}
