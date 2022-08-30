

class Monkey extends Animal
{
    void  run(){
	    System.out.println("run method from monkey");
	}
}




class Animal
{
    void  eat(){
	    System.out.println("eat method from Animal");
	} 
}



class InheritanceDemo4 
{
	public static void main(String[] args) 
	{
		 Animal  a1=new Animal();

		// a1.eat();
		// a1.run();

         Monkey  m1=new Monkey();

		// m1.eat();
		// m1.run();

		 Animal  a2=new Monkey();  

		// a2.eat();
		// a2.run();

		// Monkey  m2=new Animal();

	}
}