package method;

public class Palindromeusingmehod {
	public static void main(String arg[])
	{
		String name="bobby";
		String result =x(name);
		System.out.println(result);
	}
	public static String x(String input)
	{
		char array[]=input.toCharArray();
		int n=array.length-1;
		boolean ispalindrome=true;
		for(int i=0;i<=(n)/2;i++)
		{
			if(array[i]!=array[n])
			{
				ispalindrome=false;
				break;
			}
			n--;		
		}
		if(ispalindrome==true)
		{
			return "palindrome";
		
		}
		else
		{
			return "not palindrome";
		}

	}

}
