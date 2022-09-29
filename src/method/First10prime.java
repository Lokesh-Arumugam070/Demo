package method;

public class First10prime {
	public static void main(String arg[])
	{
		int n=20;
		 prime(n);
	}

	public static void prime(int a)
	{
		System.out.println("neither prime nor composite 1");
		for (int i = 2; i <= a; i++) {
			int flag = 0;

			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					flag++;
					break;
				}

		}if (flag == 0) {
			
			System.out.println(" prime "+i);
			

}  
	
}
	}
}
