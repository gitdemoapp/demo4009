class  Test
{
	int  rollNumber;//0

	String name;//null

	Test(int  rollNumber,String name){
	    this.rollNumber=rollNumber;
		this.name=name;
	}

	void m1(){
	  System.out.println("Name of student "+this.hashCode() +" is "+name);
	  System.out.println("Roll Number of student "+this.hashCode() +" is "+rollNumber);
	}

	public static void main(String[] args){
	    
          Test  t1=new Test(111,"ramesh");

		 


		   Test  t2=new Test(222,"suresh");

		 


		  t1.m1();

		  t2.m1();
	
	}
	
}
