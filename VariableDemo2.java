/*
     a)  

	 primitive (byte , short , int , long , float , double , boolean , char)

	 byte  a;
	 short  s;
     int   x;
	 long   b;


	 float   f;
	 double d;

	 boolean b;

	 char c;



	 non primitive | referenced variable   [class | interface | enum | array]

        VariableDemo2   a;

		String   name;

		Demo   d1;

        Student  s1;
        

		class Student{
		
		
		}
		class  Demo{
		
		}

      

	 b)   

	 static 
	 non static
	 local


	 static variable:
	 ----------------
	 1. Why 
	 2. where
	 3. ClassName  | object reference | direct (within the same class)
	 4. default value
	 
*/
class VariableDemo2 
{

    static long tollFreeNumber;  //declaration



	public static void main(String[] args)
	{
		VariableDemo2.tollFreeNumber=18001802222L;//  initialization

          System.out.println(VariableDemo2.tollFreeNumber);

	}
}

