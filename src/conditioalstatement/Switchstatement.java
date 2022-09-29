package conditioalstatement;

public class Switchstatement {
	public static void main(String arg[]) {
		char grade = 'A';
		switch (grade) {
		case 'O':
			System.out.println("excellent");
			break;
		case 'A':
			System.out.println("good");
			break;
		case 'B':
			System.out.println("average");
			break;
		case 'C': 
			System.out.println("fair");
			break;
		default:
			System.out.println("fail");
			break;

		}

	}
}
