package method;

public class Fibonacci {
	public static void main(String arg[])
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
		System.out.print(fib(i)+ " ");
	}
	}
	public static int fib(int a)
	{
		int f[]=new int[a+2];
		 f[0]=1;
		 f[1]=1;
		for(int i=2;i<=a;i++)
		{
			 f[i]=f[i-1]+f[i-2];
				
		}
		return f[a];

	}

}
