class BankCustomer
{
   String customerName;
   String emailId;
   long mobileNumber;
   int accountNumber;
   double balance;

   static String bankName;


   void viewProfile(){
      //want to display customer details
      System.out.println("============================"+this.hashCode()+"========================");
	  System.out.println("Customer Name is ::"+customerName);
	  System.out.println("Customer email id is ::"+emailId);
	  System.out.println("Customer mobile number is ::"+mobileNumber);
	  System.out.println("Customer account number ::"+accountNumber);
	 
	  System.out.println("Customer bank name is ::"+bankName);
   }

   void  checkBalance(){
      //want to display balance
	   System.out.println("Hi "+customerName +" in your account "+accountNumber +"  balance is ="+balance);
   }

   public static void main(String[] args){

	   
       BankCustomer   bankCustomer1=new BankCustomer();//object creation

	   BankCustomer   bankCustomer2=new BankCustomer();

	   BankCustomer   bankCustomer3=new BankCustomer();

	   bankCustomer1.customerName="Raja";
	   bankCustomer2.customerName="Rani";
	   bankCustomer3.customerName="Ramesh";

	   bankCustomer1.emailId="raja011@gmail.com";
	   bankCustomer1.mobileNumber=1234567764L;
	   bankCustomer1.accountNumber=655343;
	   bankCustomer1.balance=1000.0;

	   bankCustomer1.bankName="ICICI Bank";//this is static one

	   
	   bankCustomer2.emailId="rani011@gmail.com";
	   bankCustomer2.mobileNumber=1234;
	   bankCustomer2.accountNumber=6553;
	   bankCustomer2.balance=3000.0;

	   
	   bankCustomer3.emailId="ramesh011@gmail.com";
	   bankCustomer3.mobileNumber=12345678;
	   bankCustomer3.accountNumber=65520;
	   bankCustomer3.balance=2000.0;

       bankCustomer1.viewProfile();

	   bankCustomer2.viewProfile();

	   bankCustomer3.viewProfile();

       bankCustomer1.checkBalance();

	   bankCustomer2.checkBalance();

	   bankCustomer3.checkBalance();
   
   }


}//class BankCustomer





