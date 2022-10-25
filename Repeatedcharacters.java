package Array;

import java.util.HashSet;


public class Repeatedcharacters {
	public static void main(String[] args) {
		String name="mani";
		// using for loop
//		char array[]=name.toCharArray();
//		for(int i=0;i<array.length;i++)
//		{
//			int count=1;
//			for(int j=i+1;j<array.length;j++)
//			{
//				if(array[i]==array[j]&&array[i]!=' ')
//				{
//					count++;
//					break;
//				}
//			}
//			if(count>1)
//			{
//				System.out.println(array[i]);
//			}
//		}
		
		
		//using hashset
		HashSet<Character>ch=new HashSet<Character>();
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j)) {
					ch.add(name.charAt(i));
					break;
				}
				
		}
			
		}for (Character repeated : ch) {
			System.out.println(repeated);
			
		}
		
		
		
	}

}
