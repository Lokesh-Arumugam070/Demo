
public class First10primenumbers {
	public static void main(String arg[]) {
		int n = 20;
		System.out.println(1);
		for (int i = 2; i <= n; i++) {
			int flag = 0;

			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					flag++;
					break;
				}

			}
			if (flag == 0) {
				System.out.println("prime " + i);
			}
		}
	}
}
