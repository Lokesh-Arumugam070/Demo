package method;

public class Factorial {
	public static void main(String arg[])
	{
		int n=4;
		int b=factorial(n);
		System.out.println(b);
	}
    public static int factorial(int a)
	{
		int factorial=1;
		for(int i=1;i<=a;i++)
		{
			 factorial=(factorial*i);
		}
		return factorial;
	}

}
