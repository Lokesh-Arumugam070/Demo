import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EcartArrayList {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	String fruits[]= {"Brocolli","Cucumber","Carrot","Tomato"};
	int j=fruits.length;
	int n=0;
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	for (int i = 0; i <products.size(); i++) {
		//convert array to arraylist
		//check list to get desired
		
		//Brocolli - 1 kg
		String name[]=products.get(i).getText().split("-");//to split - in name(Brocolli - 1 kg)
		String needed=name[0].trim();//to remove space
		
		List<String> fruitlist=Arrays.asList(fruits);//convert array to arraylist
		if(fruitlist.contains(needed))
		{
			n++;
			//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();click add to cart
			//[text()='ADD TO CART'] causes problem while seraching in list so change to constant attribute
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(n>j)
			{
				break;
			}
		}
		
	}
}
}
