//defining Calculator class
class Calculator
{
	//declare two variables | data | properties
	int  num1;
	int  num2;


   //defining method with name sum
	void  sum(){
		System.out.println(this.hashCode() +" Addition is ="+(num1+num2));
	}

//defining method with name sum
	void multiply(){
		System.out.println(this.hashCode() +" Multiplication is ="+(num1*num2));
	}

//defining main method
	public static void main(String[]  args){

		//creating objects
		Calculator  c1=new Calculator();
		Calculator  c2=new Calculator();

//initializing values to variables
		c1.num1=10;
		c1.num2=20;

		c2.num1=100;
		c2.num2=200;

		c1.sum();
		c1.multiply();

		c1.sum();
		c1.multiply();

		c2.sum();
		c2.multiply();
	}
}

