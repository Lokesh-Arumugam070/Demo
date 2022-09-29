package method;

public class Stringsequencereverseusingmethod {
	public static void main(String arg[])
	{
		String input="India is my country";
		String start[]=input.split(" ");
		String output=reverse(start);
		System.out.println(output);
	}
	public static String reverse(String x[])
	{
		String inner="";
		for (int i = 0; i < x.length; i++) {

			char array[] = x[i].toCharArray();
			for (int j = (array.length) - 1; j >= 0; j--) {
				inner = inner + array[j];
			}
			inner = inner + " ";
		}
		return inner;
	
	}

}
