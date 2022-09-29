package array;


public class newarray {
	public static void main(String arg[]) {
		int array[] = { 1, 0, 12, 3, 0, 16, 4, 0 };
		int output[] = new int[array.length];
		int counter =0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				output[counter]=array[i];
				counter++;
			} 
		}
		for(int j=0;j<output.length;j++)
		{
			System.out.print(output[j]);
			System.out.print(" ");
		}
		
}
}

