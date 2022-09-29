package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter string");
	String name=sc.nextLine();
	int count;
	char ch;
	Map<Character, Integer> input=new HashMap<Character,Integer>();
	for(int i=0;i<name.length();i++)
	{
		ch=name.charAt(i);
		if(input.containsKey(ch))
		{
			count=input.get(ch);
			count++;
			input.replace(ch,count);
		}
		else
		{
			input.put(ch, 1);
		}
	}for(Character key : input.keySet())
	{
		System.out.println(key+ " = "+input.get(key));
	}	
	
}
}
