package array;

public class Reversestringdebuged {
	public static void main(String arg[]) {
		String input = "India is my country";
		//System.out.println(input.length());
		String start[] = input.split(" ");
		String output = "";
		for (int i = 0; i < start.length; i++) {

			// String temp=start[i];
			char array[] = start[i].toCharArray();
			for (int j = (array.length) - 1; j >= 0; j--) {
				output = output + array[j];
			}
			output = output + " ";

		
		}
		System.out.println(output);
		//output = output.trim();
		//System.out.println(output.length());
	}
}