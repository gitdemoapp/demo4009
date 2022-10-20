class  Product
{
	//properties | variables | data | fields
	 String pName;
	 int pID;
	 float pPrice;
	 String pColor;

	 void  productDescription(String  productName){
	 
	 }

	 void compareProducts(String...  item1){
	 
	 }
}


class ProductOrder{
    
    //properties | variables | data | fields
	String orderDate;
	String expectedDeliveryDate;
	String deliveryAddress1;
	String deliveryAddress2;
	String deliveryAddress3;
	int[] numberOfItems;

	void  cancelOrder(){
	
	} 
     
	void placeOrder(){
	
	}

}


class Feedback
{    //properties | variables | data | fields
     String feedbackMessage;
	 int  ratings;

	 void submitFeedback(){
	 
	 }

	 void  showFeedback(){
	 
	 }

	 void  editFeedback(){
	 
	 }

	 void  deleteFeedback(){
	 
	 }
}

class Customer
{
	//properties | variables | data | fields
	String cName;
	long cPhoneNumber;
	String cAddress;
	String cEmailID;

	void registration(String cName,String cEmailID,long phoneNumber){
	      OTP  obj1=new OTP();
		  obj1.otpValidation();
		  obj1.otpVerifivation();
	}

	void  login(long phoneNumber){

		  OTP  obj1=new OTP();
		  obj1.otpValidation();
		  obj1.otpVerifivation();
	
	}

	
}


class  OTP
{
	boolean otpValidation(){
	    
		return ;
	}

	boolean otpVerifivation(){
	
	  return   ;
	}

}

class Payement
{
	float  amountToPay;
	int    discountPer;
	int    gstPer;
	float  totalAmount;
	int  deliveryCharge;
    
	void makePayemnt(){
	

	  paymentStatus();

	}

	void paymentStatus(){
	
	}

	void cancelPayemnt(){
	
	}


}

class ClientApp
{
	public static void main(String[]  args){
	     
	}
}
