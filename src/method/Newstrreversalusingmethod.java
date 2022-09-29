package method;

public class Newstrreversalusingmethod {
	public static void main(String arg[])
	{
		String name="This Is Selenium";
		String inner=name.toLowerCase();
		String middle[]=inner.split(" ");
		String output=reverse(middle);
		System.out.println(output);
	}
	public static String reverse(String x[])
	{
		String inner="";
		for(int i=0;i<x.length;i++)
		{
			if(i==(x.length)-1)
			{
				char array[]=x[i].toCharArray();
				for(int j=(array.length)-1;j>=0;j--)
				{
					inner=inner+array[j];
				}inner=inner+" ";
				
		    }
			else {
				inner=inner+x[i];
			}inner=inner+" ";
		
	}return inner;

	}

}
