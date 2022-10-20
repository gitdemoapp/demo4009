class StaticVar 
{
	static String collegeName;

	public static void main(String[] args) 
	{
		System.out.println(collegeName);
		StaticVar.collegeName="SKIT";

		StaticVar  obj1=new StaticVar();
		StaticVar  obj2=new StaticVar();

		System.out.println(obj1.collegeName);
		System.out.println(obj2.collegeName);

		StaticVar.collegeName="SKIT University";

		System.out.println(obj1.collegeName);
		System.out.println(obj2.collegeName);

		StaticVar.collegeName=null;

		System.out.println(obj1.collegeName);
		System.out.println(obj2.collegeName);
	}
}
