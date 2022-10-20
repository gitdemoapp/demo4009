/*
    Types of methods:
	--------------------

	1) static method

	  static  void  m1(){
	   
	   }
         Test.m1();

	2) non static method

	  void  m2(){
	  
	  
	  }

	  Test  t1=new Test();
	  t1.m2();

	------------------------
	1) Parameterized method

	   static  void  m1(int   a,String  s){
	           
	   }

         Test.m1(101,"Raja");

	  void  m2(int   a, int  b){
	  
	  
	  }

	  Test  t1=new Test();

	  t1.m2(10,20);

	2) Non Parameterized method

	------------------------------
	1) void return type

	  void  m2(int   a, int  b){
	  
	  
	  }

	  int  println1(int   a, int  b){
	      
		   int  c=a+b;

		   return  c;
	  
	  }

	  Test  out=new Test();

	  int  value=out.println1(10,20);

	2) non void return type 
	------------------------------

	1) predefined method
          
		  out.println();
	   
	2) user defined method


*/

class   MethodDemo1
{
	double basSal; 

	double  basicSalary(String empName,double  basSal){

		   this.basSal=basSal;

	       System.out.println("Hi "+empName +"  your basic salary is ::"+basSal);
	       return basSal;
	}

	double  totalSalary(){
	     double  v1=                        basicSalary("Raja",10000.0);
		 double totSal=v1+v1*0.5;

		 System.out.println("your total salary is ::"+totSal);

		 return totSal;
	} 

	 void  bonus(){
	      double   x1= totalSalary();

		  double hike=x1-basSal;

          System.out.println("your total hike is ::"+hike);
	}

	public static void main(String[] args) 
	{
		 MethodDemo1  obj1=new MethodDemo1();
		 obj1.bonus();
	}
}
