package calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DateSelection {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("Webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/hotels/");
	Thread.sleep(1000L);
	driver.findElement(By.id("checkin")).click();
	List<WebElement> dates=driver.findElements(By.className("DayPicker-Day"));
	int count=driver.findElements(By.className("DayPicker-Day")).size();
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
		if(text.equalsIgnoreCase("15"))
		{
			driver.findElements(By.className("DayPicker-Day")).get(i).click();
			break;
		}
	}
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2000);
	while(!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[1]")).getText().contains("November"))
	{
		driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();;
		if(driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]/div[1]")).getText().contains("November"))
		{
			List<WebElement> date2=driver.findElements(By.className("DayPicker-Day"));
			int count2=driver.findElements(By.className("DayPicker-Day")).size();
			for(int i=0;i<count2;i++)
			{
				String text=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
				if(text.equalsIgnoreCase("15"))
				{
					driver.findElements(By.className("DayPicker-Day")).get(i).click();
					break;
				}
			}
		}
	}
}
}
