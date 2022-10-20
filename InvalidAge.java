import java.util.Scanner;
class InvalidAge extends Exception
{

    static String bestChoiceName="Raja";
	InvalidAge(String  s){
	    super(s);
	}

	public static void main(String[] args) 
	{
        Scanner s1=new Scanner(System.in);

		System.out.println("Enter your name :: ");
		String  name=s1.next();

		System.out.println("Enter your age :: ");
		int  age=s1.nextInt();

		if(age<21){
			try{
		       throw  new InvalidAge(name+" is too old , not eligible for marry");
		     }
			 catch(InvalidAge  ia){
			   System.out.println("Plesae enter age between 21 to 50");
			 }
		}

		else if(age>50){
			try{
		     throw  new InvalidAge(name+"  is a baby boy  , wait for some time ");
		    }catch(InvalidAge ia){
			   System.out.println("Plesae enter age between 21 to 50");
			}
		 }

		else{
		    System.out.println(name+ " your  age is "+ age +" and you are eligible for marry  and soon you will marry with  "+bestChoiceName);
		}

	}
}


/*
      we will take some input value as age, then will check 

	  age<=  21  age>=50   ==>You are eligible for marry

	  age<21  =>  you are too old , not eligible for marry

	  age>50  =>  you are a baby boy  , wait for some time  
*/