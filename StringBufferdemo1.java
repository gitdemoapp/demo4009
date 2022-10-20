class StringBufferdemo1 
{
	public static void main(String[] args) 
	{
		StringBuffer  sb1=new StringBuffer("java");

		System.out.println("length :: "+sb1.length());

		System.out.println("capacity :: "+sb1.capacity());

		//(oldcapacity+1)*2

		sb1.append("1234567890123456789012");

		System.out.println("length :: "+sb1.length());

		System.out.println("capacity :: "+sb1.capacity());
	}
}
