package Maps;
import java.util.*;
public class Hashmap {
	public static void main(String[] args) {
		Map<String,Integer>input=new HashMap<String,Integer>();
		input.put("Gokul", 1);
		input.put("Vignesh", 2);
		input.put("Mahesh", 3);
		input.put("Venki", 4);
		for(Map.Entry<String,Integer>set:input.entrySet())
		{
			System.out.println(set.getKey()+" "+set.getValue());
		}
		
			
		}
			
		}
		
	


