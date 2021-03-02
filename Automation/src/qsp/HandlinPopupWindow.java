package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlinPopupWindow {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//td[text()='java']/..//a[text()='download']"));
	Thread.sleep(3000);
	Robot r=new Robot();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
}
