package array;

public class Reversestring {
public static void main(String arg[])
{
	String name="john";
	String output="";
	char array[]=name.toCharArray();
	for(int i=(array.length)-1;i>=0;i--)
	{
		output=output+array[i];
	}
	System.out.println("reversed string is "+output);
//	String input="India _is _my _country";
//	String start[]=input.split("_");
//	//String output="";
//	String inner="";
//	
////	for(int i=0;i<=start.length-1;i++)
////	{
////		System.out.println(start[i]);
////	}
//	for(int i=0;i<start.length;i++)
//	{
//		inner=inner+start[i];
//		
//	}
//	//System.out.println("the string array is "+inner);
//	
//	char array[]=inner.toCharArray();
//	for(int i=0;i<(array.length);i++)
//	{
//		System.out.println(array[i]);
//		
//	}
//	for(int i=(array.length)-1;i>=0;i--)
//	{
//		output=output+array[i];
//	}
//	System.out.println("the reversed string is "+output);
}
}

