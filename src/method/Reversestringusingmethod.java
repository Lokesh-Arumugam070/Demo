package method;

public class Reversestringusingmethod {
	public static void main(String arg[])
	{
		String name="john";
		String output=reverse(name);
		System.out.println(output);
	}
	public static String reverse(String x)
	{
		String inner="";
		char array[]=x.toCharArray();
		for(int i=(array.length)-1;i>=0;i--)
		{
			inner=inner+array[i];
		}
		return inner;
	}

}
