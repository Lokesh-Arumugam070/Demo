import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazoncart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		driver.findElement(By.xpath("//div//span[text()='Sign in']")).click();
		driver.findElement(By.xpath("//div//input[@name='email']")).sendKeys("nalokesh1@gmail.com");
		driver.findElement(By.xpath("//div//span[@id='continue']")).click();
		driver.findElement(By.xpath("//div//input[@name='password']")).sendKeys("LokesH_07096");
		driver.findElement(By.xpath("//div//span[@id='auth-signin-button']")).click();
		driver.findElement(By.xpath("//div//input[@id='twotabsearchtextbox']")).sendKeys("honor 7c mobile");
		driver.findElement(By.xpath("//span//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.linkText("Huawei Honor 6 Plus (32 GB, 3 GB RAM, Black) Without Offer")).click();
		Set<String> windows =driver.getWindowHandles();//parentID,childId
		Iterator<String>it=windows.iterator();
		String parentId=it.next();//at first
		String childId=it.next();//at second
		driver.switchTo().window(childId);//switch to child window
		driver.findElement(By.xpath("//span//input[@id='add-to-cart-button']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//div//span[@id='attach-sidesheet-checkout-button']")).click();
		driver.findElement(By.xpath("//div//label//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")).click();
		driver.findElement(By.xpath("//span//span[@class='a-button a-button-dropdown']")).click();
		driver.findElement(By.xpath("//div//ul//li[6]")).click();
		driver.findElement(By.xpath("//div//span")).click();
	}

}
