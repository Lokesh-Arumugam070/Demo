
public class Fibonacciseries {
	public static void main(String arg[])
	{
		int first =1;
		int second =1;
		System.out.print(first);
		System.out.print(" ");
		System.out.print(second);
		System.out.print(" ");
		for(int i=1;i<=8;i++)
		{
			int nextterm=first+second;
			System.out.print(nextterm);
			System.out.print(" ");
			first=second;
			second=nextterm;
			
		}
	}

}
