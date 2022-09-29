package array;

public class Newreversestring {
public static void main(String arg[])
{
	//String input = "India Is My Country";
	String input="This Is Selenium";
	String inner=input.toLowerCase();
	String middle[]=inner.split(" ");
	String output="";
//	for(int i=0;i<middle.length;i++)
//	{
//	System.out.print(middle[i]);
//	}
	for(int i=0;i<middle.length;i++)
	{
		if(i==(middle.length)-1)
		{
			char array[]=middle[i].toCharArray();
			for(int j=(array.length)-1;j>=0;j--)
			{
				output=output+array[j];
			}output=output+" ";
			
	    }
		else {
			output=output+middle[i];
		}output=output+" ";
	
}System.out.println(output);
}
}
