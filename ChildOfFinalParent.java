class FinalParent 
{
	void m1(){
	   System.out.println("This is m1 from FinalParent");
	}
	
}

class ChildOfFinalParent 
{
   public static void main(String[] args){
      FinalParent  obj1=new FinalParent();
	  obj1.m1();
   }
}
