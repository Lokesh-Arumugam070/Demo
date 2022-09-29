package classs;
class Addition
{
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
}

public class Overloading {
	public static void main(String[] args) {
		
		Addition a=new Addition();
		System.out.println(a.add(10,20));
		System.out.println(a.add(10,20,2));
		System.out.println(a.add(10,20,30,8));
		
	}

}
