class BankCustomer //defining BankCustomer class
{

	String name;//variable/data/properties/state==defining a non static variable

	void registration(){  //defining registration method
	
          System.out.println("customer registration completed  "+this.hashCode());
	}

	void  login(){//defining login method
	     System.out.println("customer looged in successfully  "+this.hashCode());
	}

	void  showBalance(){//defining showBalance method
	    
		 System.out.println("Your balance is low  " +this.hashCode());
	
	}

	void  balanceTransfer(){//defining balanceTransfer method
	    
		System.out.println("Hey customer you can not transfer money "+this.hashCode());
	
	}

	void showCustomerDetails(){//defining showCustomerDetails method
	
		System.out.println("Your name is "+this.hashCode() +"  "+name);
	}

	public static void main(String[] args) //defining main method
	{
		BankCustomer  bc1=new BankCustomer();//object creation

		bc1.registration();//method calling
		bc1.login();//method calling
		bc1.showBalance();//method calling
		bc1.balanceTransfer();//method calling

		
		bc1.name="Vinay kumar";//initializing variable

		bc1.showCustomerDetails();//method calling


		BankCustomer  bc2=new BankCustomer(); //object creation

		bc2.name="rani";//initializing variable

		bc2.registration();//method calling

		bc2.login();//method calling

		bc2.showCustomerDetails();//method calling


		BankCustomer  bankCustomer3=new BankCustomer();//object creation

		bankCustomer3.name="Raja";//initializing variable

		bankCustomer3.balanceTransfer();//method calling

		bankCustomer3.showCustomerDetails();//method calling

	}
}
