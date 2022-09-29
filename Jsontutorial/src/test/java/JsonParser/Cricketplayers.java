package JsonParser;

import java.io.FileReader;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

public class Cricketplayers {
	public static void main(String[] args) {
		int foreignplayercount = 0;
		try {
			JSONParser jsonparcer = new JSONParser();
			FileReader reader = new FileReader("E:\\MavenNew\\Jsontutorial\\JSON\\Players.json");
			Object obj = jsonparcer.parse(reader);
			JSONObject cricketplayersobj = (JSONObject) obj;

			JSONArray playerJsonarray = (JSONArray) cricketplayersobj.get("Players");
			for (int i = 0; i < playerJsonarray.size(); i++) {
				JSONObject playerobj = (JSONObject) playerJsonarray.get(i);
				String country = (String) playerobj.get("Country");
				if (!country.equalsIgnoreCase("india")) {
					String name = (String) playerobj.get("name");
					System.out.println(name+" country "+country);
					foreignplayercount++;
				}
				String role = (String) playerobj.get("Role");
				if (role.equals("WK")) {
					System.out.println("Wicket kepper name is" +playerobj.get("name") );
				}
			}
			System.out.println("Foreignplayercount: "+foreignplayercount);
			Assert.assertEquals(foreignplayercount, 5);}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
