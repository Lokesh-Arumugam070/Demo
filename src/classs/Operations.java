package classs;

public class Operations {
	
	int a,b;

	public Operations(int x,int y)
	{
		this.a=x;
		this.b=y;	
	}
	public int add()
	{
		int result=a+b;
		return result;
	}
	
	public int sub()
	{
		int result=a-b;
		return result;
	}
	public int multiply()
	{
		int result=a*b;
		return result;
	}
	public int divide()
	{
		int result=a/b;
		return result;
	}
	public static void main(String arg[])
	{
		Operations o1=new Operations(20,10);
		System.out.println("addition of two numbers is "+o1.add());
		System.out.println("subtraction of two numbers is "+o1.sub());
		System.out.println("multiplication of two numbers is "+o1.multiply());
		System.out.println("divison of two numbers is "+o1.divide());
	}
}
