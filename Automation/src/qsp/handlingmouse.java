package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingmouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement elec = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a=new Actions(driver);
		a.moveToElement(elec).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Power Banks']")).click();

	}

}
