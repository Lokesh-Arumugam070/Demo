package exception;

public class Trycatchfinally {
	public static void main(String arg[])
	{
		try
		{
			System.out.println("hi");
			int i=10/2;
			System.out.println(i);
			System.out.println("hey");
		}
		catch(Exception e)
		{
			System.out.println("false");
		}
		finally
		{
			System.out.println("all codes are executed");
		}

}
}
