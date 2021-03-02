package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dummy {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Telangana']")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement mouse = driver.findElement(By.xpath("//a[text()='Hyderabad - KPHB']"));
		Actions a=new Actions(driver);
		a.moveToElement(mouse).perform();
		mouse.click();
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("//section[@class=\"modal-card-body\"]"));
		System.out.println(address.getText());
		WebElement verify = driver.findElement(By.xpath("//div[@class=\"modal-card\"]/descendant::span[text()='Batches']"));
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Thread.sleep(3000);
		verify.click();
		WebElement page = driver.findElement(By.xpath("//h1[@class=\"title has-text-primary\"]"));
		String value = page.getText();
		if(value.equals("Batches"))
		{
			System.out.println("Batch Page Is Displayed");
		}
		else {
			System.out.println("Batch Page Is Not Displayed");
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class=\"card\"]/descendant::span[text()='Enroll']")).click();
	    WebElement sel = driver.findElement(By.xpath("//input[@class=\"vs__search\"]"));
//	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    Thread.sleep(4000);
	    sel.sendKeys("Core Java");
	    Thread.sleep(4000);
	     WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
	    submit.click();
	    WebElement error = driver.findElement(By.xpath("//span[text()='This field is required']"));
	    String text = error.getText();
	if(text.equals("This field is required"))
	   {System.out.println("Error Message Is Displayed Test Step Passed");
	   }
	   else
		   {
		   System.out.println("Error Message Is Not Displayed Test Step Failed");
		   }
	}

}
