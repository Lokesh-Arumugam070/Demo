package array;

public class Lineararray {
  public static void main(String arg[])
  {	
		/*int a[] = { 10, 20, 30, 10, 80, 10, 20, 10 };
		
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == 10) {
				count++;
			}

		}
		System.out.println("number of 10 in array is " + count);
		
*/
//	  String s ="Mahesh";
//		String s1 = new String("Mahesh");
//		
//		System.out.println(s);
//		System.out.println(s1);
//		if(s == s1)
//		{
//			System.out.println("same name");
//		}
//		
//		if(s.equals(s1))
//		{
//			System.out.println("both are same");
//		}
	  String s[]= {"john","canady","arnold","chris","john"};
	  String s1=new String("john");
	  int count=0;
	  for(int i=0;i<s.length;i++)
	  {
		  if(s[i].equals(s1))
		  {
			  count++;
		  }  
	  }System.out.println("frequency of occurence of "+" is "+count);
	  
//	  String s[]= {"john","canady","arnold","chris"};
//	  String s1=new String("john");
//	  for(int i=0;i<s.length;i++)
//	  {
//		  if(s[i].equals(s1))
//		  {
//			  System.out.println("match is found at "+i);
//		  } 
//		  
//	  } 
// }
}
}
