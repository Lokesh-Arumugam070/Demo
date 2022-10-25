package Array;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Countspecificword {
	public static void main(String[] args) throws IOException{
		String filepath="C:\\Users\\HP\\Desktop\\Demotext.txt";
		String str=  new String(
                Files.readAllBytes(Paths.get(filepath)));
		String name[]=str.split(" ");
    	String s;
    	int count;
    	Map<String, Integer> input=new HashMap<String,Integer>();
    	for(int i=0;i<name.length;i++)
		{
    		//System.out.println(name[i]);
    		s=name[i];
    		if(s.equals("the"))
    		{
    		
    		if(input.containsKey(s))
    		{
   			count=input.get(s);
  			count++;
    			input.replace(s,count);
    			}
  		   else
    		{
    			input.put(s, 1);
    		}
    }
		}
 	for (Map.Entry<String,Integer>entry : input.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}			
    		
}


}
