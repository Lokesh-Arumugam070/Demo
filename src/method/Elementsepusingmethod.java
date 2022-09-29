package method;

public class Elementsepusingmethod {
	public static void main(String arg[])
	{
		int a[] = { 10, 20, 30, 10, 80, 10, 20, 10 };
		s(a);
		
	}
	public static void s(int x[])
	{
		int input[]= { 1, 0, 12, 3, 0, 16, 4, 0 };
		int output[] = new int[input.length];
		int counter =0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[counter]=input[i];
				counter++;
			}
		} 
		for(int j=0;j<output.length;j++)
		{
			System.out.print(output[j]+" ");
		}
	}

}
