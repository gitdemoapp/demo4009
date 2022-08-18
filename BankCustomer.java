class BankCustomer 
{

	String name;//variable/data/properties/state

	void registration(){
	
          System.out.println("customer registration completed  "+this.hashCode());
	}

	void  login(){
	     System.out.println("customer looged in successfully  "+this.hashCode());
	}

	void  showBalance(){
	    
		 System.out.println("Your balance is low  " +this.hashCode());
	
	}

	void  balanceTransfer(){
	    
		System.out.println("Hey customer you can not transfer money "+this.hashCode());
	
	}

	void showCustomerDetails(){
	
		System.out.println("Your name is "+this.hashCode() +"  "+name);
	}

	public static void main(String[] args) 
	{
		BankCustomer  bc1=new BankCustomer();

		bc1.registration();
		bc1.login();
		bc1.showBalance();
		bc1.balanceTransfer();

		
		bc1.name="Vinay kumar";
		bc1.showCustomerDetails();


		BankCustomer  bc2=new BankCustomer();

		bc2.name="rani";

		bc2.registration();

		bc2.login();

		bc2.showCustomerDetails();


		BankCustomer  bankCustomer3=new BankCustomer();

		bankCustomer3.name="Raja";

		bankCustomer3.balanceTransfer();

		bankCustomer3.showCustomerDetails();

		


	}
}
