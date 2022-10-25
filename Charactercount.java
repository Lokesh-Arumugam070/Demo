package Array;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Charactercount {
	public static void main(String[] args) throws IOException {
		int count=1;

		String filepath = "C:\\Users\\HP\\Desktop\\Demotext.txt";
		String str = new String(Files.readAllBytes(Paths.get(filepath)));
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}System.out.println("Total characters in text file:"+count);
	}
}