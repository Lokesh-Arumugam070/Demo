package Maps;

import java.util.HashMap;
import java.util.Map;

public class CharacterHashMap {
	public static void main(String[] args) {
		Map<Character,Integer>input=new HashMap<Character,Integer>();
		input.put('M',1);
		input.put('A',1);
		input.put('H',2);
		input.put('E',1);
		input.put('S',3);
		input.put('H',4);
		input.forEach(
	            (key, value)
	                -> System.out.println(key + " = " + value));
		
}
}
