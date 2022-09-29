package string;

public class Doublequotedstring {
	public static void main(String arg[]) {
		String input = "moon sun \"solar system\"earth \"mars jupitor\"";
		String outputarray[] = new String[5];
		int arraycount = 0;
		int doublequotescounter = 0;
		String indexvalue = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '"') {
				indexvalue = indexvalue + input.charAt(i);
				if (doublequotescounter == 0) {
					doublequotescounter++;
				} else {
					outputarray[arraycount] = indexvalue;
					doublequotescounter = 0;
					indexvalue = "";
					arraycount++;
				}
			} else if (input.charAt(i) == ' ' && doublequotescounter == 0 && indexvalue.length() != 0) {
				outputarray[arraycount] = indexvalue;
				indexvalue = "";
				arraycount ++;

			} else {
				indexvalue = indexvalue + input.charAt(i);
			}

		}
		for (int i = 0; i < outputarray.length; i++) {
			System.out.println(outputarray[i]);
		}

	}
}
