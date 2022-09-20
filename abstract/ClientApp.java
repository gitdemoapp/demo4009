import java.util.Scanner;
class  ClientApp
{
	public static void main(String[] args) 
	{
        Scanner s1=new Scanner(System.in);
		System.out.println("Enter name of diagram to find area");

		String  nameOfDiagram=s1.next();

		Area  area=Factory.getAreaObject(nameOfDiagram);

		area.calculateArea();
	}
}
