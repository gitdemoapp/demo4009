class Parent
{
	 String  name="Raja";

	void property(){
	   System.out.println("1000 crore rupees");
	}

	void sleep(){
	    System.out.println("sleep at 9:00 PM");
	}

	void drink(){
	   System.out.println("drink milk and water");
	}

    void eat(){
	System.out.println("eat veg only");
	}
}

class Child  extends Parent
{
    
}

class InheritanceDemo1 
{
	public static void main(String[] args) 
	{

		Parent  p1=new Parent();

		Child  c1=new Child();

		c1.property();
		c1.eat();
		c1.drink();
		c1.sleep();

		System.out.println(c1.name);
	}
}
