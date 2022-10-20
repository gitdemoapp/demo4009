/*
   StringBuffer class important methods
   ====================================
   1. public int length() 
   2. public int capacity()
   3. public char charAt(int  index)
   4. public void setCharAt(int index,char charToSet)
   5. public void append(String  sb)
   6. public void append(StringBuffer  sb)


   7. public void append(long  sb)
   8. public void append(boolean  sb)
   9. public void append(double sb)
   10. public void append(float sb)
   11. public void append(int index,Object sb)
   12. public void insert(int index,String  b);
   13.public void insert(int index,int  b);
   14.public void insert(int index,long  b);

   15.public void delete(int beginIndex,int  endInex);

   16.public void deleteCharAt(int index);

   17. public void reverse();

   18. public void setLength(int lengthToSet);

   19. public void trimToSize();

   20. public void ensureCapacity(int  cp);



*/

class StringBufferDemo2 
{
	public static void main(String[] args) 
	{
		/*StringBuffer  b1=new StringBuffer();
		int len=b1.length();
        b1.append("java");
		int len1=b1.length();
		System.out.println(len1);
        int cap =b1.capacity();
		System.out.println(cap);
        
		StringBuffer  b1=new StringBuffer("java");
		//char  ch=b1.charAt(4);
		//System.out.println(ch);


		b1.setCharAt(2,'w');

		System.out.println(b1);

		b1.append("bike");

		System.out.println(b1);

		b1.append(true);

		System.out.println(b1);

		b1.append(10.0f);

		System.out.println(b1);
         
		
		b1.append("is good");

        StringBuffer  b1=new StringBuffer("jaja");
		System.out.println(b1);
		b1.insert(2,"jakabooter1ja");

		System.out.println(b1);


		b1.insert(10,1);

		System.out.println(b1);

        StringBuffer  b1=new StringBuffer("jaja");
		b1.delete(2,4);


		 StringBuffer  b1=new StringBuffer("kayum ansari");
		// b1.deleteCharAt(2);
            b1.reverse();

		StringBuffer  b1=new StringBuffer();
		System.out.println(b1.length());
		

		b1.append("javaatbytecode");

		//b1.setLength(4);

		b1.trimToSize();

		System.out.println(b1.length());

		System.out.println(b1.capacity());

		System.out.println(b1);*/

       StringBuffer  b1=new StringBuffer();

        System.out.println(b1.capacity());
        b1.ensureCapacity(1000);

        System.out.println(b1.capacity());

	}
}
