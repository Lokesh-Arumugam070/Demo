package exception;

public class Nullexception {
	public static void main(String arg[])
	{
		try
		{
			System.out.println(1);
			int i=10/0;
			String s=null;
			System.out.println(s.length());
			//boolean is=s.equals(false);
			System.out.println(2);
		}
		catch(ArithmeticException e)
		{
			int i=10/5;
			System.out.println(i);
			System.out.println("exception handled");
		}
		catch(Exception e)
		{
			String s="lokesh";
			System.out.println(s);
		}
		finally
		{
			System.out.println("bye");
		}
	}

}
