package array;

public class palindrome {
public static void main(String arg[])
{
	String name="ammaa";
	char array[]=name.toCharArray();
//	String reverse="";
//	for(int i=(array.length)-1;i>=0;i--)
//	{
//		reverse=reverse+array[i];
//	}
//if(name.equals(reverse))
//{
//	System.out.println("palindrome");
//}
//else
//{
//	System.out.println("not palindrome");
//}
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
		System.out.println("palindrome");
	
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}