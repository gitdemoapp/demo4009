/*
     How to take input from user at runtime?

   
 non static  methodName--->ClassName--->object ref


 next()  ==>String  value
 nextDouble() ==>double value
 nextLong()
 nextBoolean()
 nextFloat()
 nextShort()
 nextInt()

 non static ===>

 ====>  java.util.Scanner

 java.util.Scanner  obj=new java.util.Scanner(System.in);

String  pName=obj.next();
String  pModel=obj.next();
String  pBrandName=obj.next();

double  pPrice=obj.nextDouble();



*/
class  Printer
{
     String printerName;
	 String printerModel;
	 static String printerBrandName;
	 double price;
	 boolean flag;

	static  void viewPrinterDetails(Printer  printer){
	     System.out.println("============================");
		 System.out.println("Printer brand name:: "+printerBrandName);
		 System.out.println("Printer  name ::"+printer.printerName);
		 System.out.println("Printer model name ::"+printer.printerModel);
		 System.out.println("Printerprice :: "+printer.price);
	}

	void  printInBlack(){
	      boolean  status=isPrinterWorking(flag);
		   if(flag==true){
	            System.out.println(printerName +" prinitng in black...");
		   }
		   else{
		        System.out.println(printerName +" printer is not working...");
		   }
	}

	void printInColor(){
           boolean  status=isPrinterWorking(flag);
		   if(flag==true){
	            System.out.println(printerName +" prinitng in color...");
		   }
		   else{
		        System.out.println(printerName +" printer is not working...");
		   }
	}

	boolean isPrinterWorking(boolean  status){  //non void return type method

	       if(status==true) {
		      return true;
		   }
		   else{
		     return false;
		   }
	}
}
class  InputDemo1 
{
	public static void main(String[] args) 
	{
		 java.util.Scanner  scanner=new java.util.Scanner(System.in);

		 System.out.println("Please enter printer brand name :: ");
         Printer.printerBrandName =scanner.next();
         
		 Printer  printer1=new Printer();

		 System.out.println("Please enter printer name :: ");
         printer1.printerName =scanner.next();

		 System.out.println("Please enter printer model number  :: ");
         printer1.printerModel =scanner.next();

		 System.out.println("Please enter printer price  :: ");
         printer1.price =scanner.nextDouble();

		 System.out.println("Please enter status of printer  :: ");
         printer1.flag =scanner.nextBoolean();

		 Printer.viewPrinterDetails(printer1);
         printer1.printInBlack();
		 printer1.printInColor();

	}
}
