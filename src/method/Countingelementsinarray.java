package method;

public class Countingelementsinarray {
	public static void main(String arg[])
	{
		 int a[] = { 10, 20, 30, 10, 80, 10, 20, 10 };
		int result=n(a);
		System.out.println("number of 10 in array is "+result);
	}
	public static int n(int x[])
	{
      
		
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			
			if (x[i] == 10) {
				count++;
			}

		}return count;

	}
	}





