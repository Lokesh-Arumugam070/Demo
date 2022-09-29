package classs;
class Car
{
	String brand;
	String colour;
	int airbags;
	int cc;
	public  Car()
	{
		
	}//non-parametrised constructor variable initialisation
	public Car(String s1,String s2,int x,int y)
	{
		this.brand=s1;
		this.colour=s2;
		this.airbags=x;
		this.cc=y;
	}//parametrised constructor variable initialisation
	void details(String s1,String s2,int x,int y)
	{
		this.brand=s1;
		this.colour=s2;
		this.airbags=x;
		this.cc=y;
	}//method wise variable initialisation
	void display()
	{
		System.out.println(brand);
		System.out.println(colour);
		System.out.println(airbags);
		System.out.println(cc);
		System.out.println();
		
	}}

	public class Bike
	{
		
	
	public static void main(String arg[])
	{

		
		Car c1=new Car();
		c1.brand="Hyndai";
		c1.colour="metallic grey";
		c1.airbags=2;
		c1.cc=1000;
		c1.display();//non-parametrised constructor variable initialisation
		
		Car c2=new Car("Hyndai","Red",2,1000);
		c2.display();//parametrised constructor variable initialisation
		
		
		Car c3=new Car();
		Car c4=new Car();
		Car c5=new Car();
		c3.details("Hyndai","Red",2,1000);
		c4.details("Maruthi","Grey",2,1500);
		c5.details("Skoda","Blue",2,2000);
		c3.display();
		c4.display();
		c5.display();//method wise variable initialisation
			
	}

}