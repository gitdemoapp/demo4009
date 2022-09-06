//Overriding in case of var arg method


class Parent6
{
	void m1(int...  a){
	   System.out.println("Hi World!");
	}
}



class Child6 extends Parent6
{
	void m1(int...  a){
	   System.out.println("Hello World!");
	}
}
class OverDemo6 
{
	public static void main(String[] args) 
	{
		Parent6  p1=new Child6();
		p1.m1(101);
	}
}
