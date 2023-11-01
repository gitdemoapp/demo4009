//Defining a class with name Car

class Car
{

	//declare properties of car
	   //-static properties
	   static String  brandName;
	   static String  orgAddress;
	   static long    tollFreeNumber;

	   //non static properties
	    String carName;
		String modelName;
		double price;
		String carNumber;

		int gearNumber=0;


		//defining some functionalities for Car

        void  carDetails(){
			 System.out.println("Car Name ::"+carName);
			 System.out.println("Model Name ::"+modelName);
			 System.out.println("car price is ::"+price);
			 System.out.println("car number is ::"+carNumber);
        }

		void  move(long  carNumber){
			 System.out.println("Car is moving "+carNumber);
		}

		void  start(){
			System.out.println("Car started ...ready to move ..."+carName);
			 move(11122233L);  //calling non static method under non static method
		}

		static void carCompanyDetails(Car  c3){
			System.out.println("Company name is ::"+brandName);
			System.out.println("Company tollfree number ::"+tollFreeNumber);
           
			c3.carDetails(); //calling non static method under static method
		}

       void speedUp(){
		   gearNumber++; //accessing non static variable under non static method
		   System.out.println("Increasing speed of car by changing gear "+gearNumber);
       }

	   void speedDown(){
		   gearNumber--; //accessing non static variable under non static method
		   System.out.println("Decreasing speed of car by changing gear "+gearNumber);
	   }

	   public static void main(String[]   args){
		    //initializing static variables
            Car.brandName="Maruti Suzuki";
			Car.orgAddress="Japan";
			Car.tollFreeNumber=18001803322L;

			//initializing non static variables | instance variables
                     //first we need to an object of class Car to get obejct ref
			  Car  c1=new Car();
			  c1.carName="WagonR";
			  c1.modelName="VXI";
			  c1.price=600000.0D;
              c1.carNumber="UP 78 GA 4343";
                    
					//creating second car object

			  Car  c2=new Car();
			  c2.carName="Baleno";
			  c2.modelName="Zeta";
			  c2.price=200000.0D;
              c2.carNumber="UP 78 HE 7319";
			  
			  //c1.carCompanyDetails(c2);  //calling static method using object reference
              //c1.carCompanyDetails(c1);

			  c1.speedUp();
			  
	   } 

} //class 