package method;

public class Stringarray {
	public static void main(String arg[])
	{
		  int result=n();
		  System.out.println(result);

}
	public static int n()
	{
		String s[]={"john","canady","arnold","chris","john"};
		  String s1=new String("john");
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(s1))
			{
			  count++;	
			}
		}return count;
	}
}
