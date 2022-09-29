package classs;
class Animal
{
	void bark()
	{
		System.out.println("dog is barking");
	}
	public Animal()
	{
		System.out.println("common");
	}
}
 class Dog extends Animal
{
	void eat()
	{
		System.out.println("eating");
	}
	
}
 class Cat extends Dog
 {
	 public Cat()
	 {
		 System.out.println("weeping");
	 }
 }

public class Inheritance {
	 
		public static void main(String arg[])
		   {
			   Cat d=new Cat();
			   d.eat();
			   d.bark();
	
			   
		   }
		
	}	
  ///single and multilevelinhertance


