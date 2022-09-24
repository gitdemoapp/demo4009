/*

    Interface:
	-----------

	1. introduction
	2. interface declaration and implementation
	3. interface variable:
	--------------------------

	 public static final 


	 int   accountNumber=073002132;

	 public int   accountNumber=073002132;

	 static int   accountNumber=073002132;

	 final int   accountNumber=073002132;

	 public  static int   accountNumber=073002132;

	 public  final int   accountNumber=073002132;

	 final static int   accountNumber=073002132;

	 public static final int   accountNumber=073002132;

	4. interface methods:
	  -------------------

	void m1();

	public void m1();

	abstract void m1();

	public abstract void m1();
      

	5. extends vs implements
	=========================

	class---->extends---->class

	interface ====>implements====>class

	interface====>extends====>interface

    class ====>implements====>interface===>not possible

   

	interface Test1 {
	  
	    void m1();
	   
	}

	interface Test2 {
	   
	    void m2();
	   
	}

	interface Test3  extends Test1,Test2 {
	  
	}

	class Test4 implements Test3{
	
	
	}

	class Test5 implements Test2{
	
	
	}


    

	6. Naming conflicts
	    method naming conflicts:
		------------------------


		variable naming conflicts

    7. marker interface
	8. Adapter class
	9. difference between concrete class , abstract class and interface


interface InterfaceTest1
{
     void m1();
	 void m2();
}
abstract class InterfaceTest1Impl implements InterfaceTest1
{
	public void m1(){
	 
	}
	
}

class InterfaceTest2 extends InterfaceTest1Impl
{
	public void m2(){
	 
	}
}


class InterfaceTest3 implements InterfaceTest1
{
    public void m2(){
	 
	}

	public void m1(){
	 
	}
}


Case-1:

Case-2:

Case-3:

*/

interface I1
{

	 int m1();

}

interface I2
{

	 void m1();

}

class InterfaceDemo1 implements I2,I1{

     public void m1(){
       
     }



	  public int m1(){
         return 10;
      }

	

  
	public static void main(String[] args) 
	{
		System.out.println();
	}
}
