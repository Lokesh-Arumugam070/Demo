package classs;
class A
{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
 class B extends A
{
	void eat()
	{
		System.out.println("eating");
	}
}
 class C extends A
 {
	 void weep()
	 {
		 System.out.println("weeping");
	 }
 }


public class HierarchicalInheritance {
	public static void main(String arg[])
	   {
		   C d=new C();
		   d.bark();
		   d.weep();
		   //d.eat();
		   
	   }

}
