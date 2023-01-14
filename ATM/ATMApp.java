/*
    while (condition) {
  // code block to be executed
}
*/
class ATMApp 
{
	public static void main(String[] args) 
	{
        java.util.Scanner sc=new java.util.Scanner(System.in);

		System.out.println("please enter your name !!!");
 
         BankCustomer   bc1=new BankCustomer();

		 bc1.customerName=sc.next(); 
        //need to call  non static verifyPinNumber  method from ATMPin class

		 ATMPin  obj1=new ATMPin();
		
         boolean  a=true;
         int  count=1;

         boolean  flag=obj1.verifyPinNumber();

		 while(count<3){
            
            if(flag==true){
		          System.out.println(bc1.customerName+"  logged in succeefully !!!");

				  break;
				  //select any option to debit or transfer amount........
			 }

			 else{
				 
			   flag= obj1.verifyPinNumber();
			 }

			     count++;
             
				if(count==3  && flag==false){
				   System.out.println("Your card is blocked for 24 hours");
				}
		}//while
          //wrong pin number 3 times
	}//method
}//class


