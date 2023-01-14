class ATMPin 
{
	 public boolean verifyPinNumber(){
	      
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("please enter valid atm pin number!!!");
        boolean b=false;
		int   pin=sc.nextInt();
		
		   switch(pin){

		   case 1111:
                b=true ;
             break;
		   case 2222:
			 
			     b=true ;
             break;
            
		   case 3333:
			     b=true ;
             break;

		   case 4444:
			     b=true ;
             break;

  }
   return b;
}
}
/*
switch(expression)
{    
 case value1:   

     //code to be executed;    
      break;  //optional  

case value2:    

   //code to be executed;    
   break;  //optional  
   ......    
    
default:     
  code to be executed if all cases are not matched;  
} 
*/