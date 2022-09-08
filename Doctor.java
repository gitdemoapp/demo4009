class Doctor 
{
	
      void  m1(){
	  
	   System.out.println("This is m1 non static method");
	  }

	  static  void  m2(){
	  
	     System.out.println("This is m2  static method");
	  }

     public static void main(String[] args){
    System.out.println("This is main static method");

	Doctor   obj1=new Doctor();
	obj1.m1();

	Doctor.m2();
   
   }

	
}
