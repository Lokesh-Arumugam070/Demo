package exception;

public class Trycatch {
	public static void main(String arg[])
	{
		try
		{
			System.out.println("hi");
			int i=10/0;
			System.out.println("hey");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		finally
		{
			System.out.println("catch is executed");
		}
	}

}
