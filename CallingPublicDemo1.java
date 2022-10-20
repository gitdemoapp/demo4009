package p2;
import p1.PublicDemo1;
class CallingPublicDemo1 
{
	public static void main(String[] args) 
	{
		PublicDemo1  obj1=new PublicDemo1();
        String  s1=obj1.toString();
		System.out.println(s1);
	}
}
