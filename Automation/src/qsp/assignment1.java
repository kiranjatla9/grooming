package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=null;
	 String url="https://www.google.com/";
	 System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 

	 driver.get(url);
	 driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("qspiders");
//	 jnj
	 Thread.sleep(2000);
	 
		int rev = driver.findElements(By.xpath("//li[contains(@class,'sbct')]")).size();
		System.out.println("the number of results foundare: +rev");
		System.out.println("****************");
		System.out.println("the search results include : ");
		
//		for(WebElement ele :rev)
		{ 
//			System.out.println(((WebElement) ele).getText());
		}
		}}