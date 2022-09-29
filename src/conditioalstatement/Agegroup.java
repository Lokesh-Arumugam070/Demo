package conditioalstatement;

public class Agegroup {
	public static void main(String arg[]) {
		int age = 30;
		
		if (age >= 0 && age <= 8)
		{
			System.out.println("child age");
		} 
		else if (age > 8 && age <= 16)
		{
			System.out.println("middle age");
		} 
		else if (age > 16 && age <= 24) 
		{
			System.out.println("teenage");
		} 
		else if (age > 24 && age <= 32)
		{
			System.out.println("youngster");
		} 
		else if (age > 32 && age <= 40) 
		{
			System.out.println("responsibility age");
		} 
		else if (age < 0) 
		{
			System.out.println("invalid age");
		} 
		else
		{
			System.out.println("old age");
		}

	}
}
