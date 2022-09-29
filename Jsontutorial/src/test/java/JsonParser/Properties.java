package JsonParser;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Properties {
	public static void main(String[] args) {
		try {
			JSONParser jsonparcer = new JSONParser();
			FileReader reader = new FileReader("E:\\MavenNew\\Jsontutorial\\JSON\\Property.json");
			Object obj = jsonparcer.parse(reader);
			JSONArray propertiesobj=(JSONArray) obj;
			for(int i=0;i<propertiesobj.size();i++)
			{
				JSONObject value=(JSONObject) propertiesobj.get(i);
				for(int j=0;j<value.size();j++)
				{
				if(j==0)
				{System.out.println(value.get("name"));}
				if(j==1)
				{System.out.println(value.get("Age"));}
				if(j==2)
				{System.out.println(value.get("Id"));}
				if(j==3)
				{
					JSONArray power=(JSONArray) value.get("Powers");
					for(int k=0;k<power.size();k++)
					{
						System.out.println(power.get(k));
					}
				
				
			}System.out.println();
				}	
			}}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}

