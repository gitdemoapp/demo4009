/*
   1.   String  s1=new String();

   2.   String  s1=new string("");

   3.   String  s3=new String(StringBuffer);

   4.   String  s4=new String(char[]  );

   5.   String  s4=new String(byte[]  );



   Important methods of String class:
   ==================================

   1. public char charAt(int index)
   2. public String concat(String s);
   3. public boolean equals(Object  s);
   4. public boolean equalsIgnoreCase(Object  s);
   5. public String substring(int  startindex)

   6. public String substring(int  startIndex,int  endIndex)

   7. public int length();

   8. public String replace(char  old,char  new);
   9. public String  toLowerCase()
   10.  public String  toUpperCase()




*/


class StringDemo5 
{
	public static void main(String[] args) 
	{
/*
		StringBuilder  sb2=new StringBuilder("java");

		sb2.append("program");


		System.out.println(sb2);

		String  s1=new String(sb2);

		s1.concat(" at bytecode");

		System.out.println(s1);


         char[]   ch={'a','b','c','d'};

		 String   s1=new String(ch);

		 System.out.println(s1);

		 


		 byte[]   ch={101,102,103,104,105};

		 String   s1=new String(ch);

		 System.out.println(s1);

		
       
	    StringBuilder  sb2=new StringBuilder("java");
        String  s1=new String(sb2);
		System.out.println(s1);

		 

		String   s1=new String("java at bytecode it solutions");

		String s2=s1.concat(" by kayum sir");

		System.out.println(s2);


		

        java.util.Scanner s1=new java.util.Scanner(System.in);

		System.out.println("please enter your user name");

		String  uname=s1.next();



		String   dbUserName="Raja";

		String   dbPassword="Rani";


		boolean b1=uname.equals(dbUserName);

        System.out.println(b1);

    

	String  s1="javaatbytecode";

	String s2=s1.substring(4,10);

	System.out.println(s1);


	System.out.println(s2);

	
    String   s1=new String("     java at bytecode it solutions    ");

	System.out.println(s1.length());


	

	String  s1="ababab";

	String  s2=s1.replace('a','b');

	System.out.println(s2);

	
    String s3= s2.toUpperCase();

    System.out.println(s3);

	String s4= s2.toLowerCase();

    System.out.println(s4);

	*/

	String  s1="    ja    va    ";
	System.out.println(s1.length());

	String  s2=s1.trim();

	System.out.println(s2.length());
	

	}
}
