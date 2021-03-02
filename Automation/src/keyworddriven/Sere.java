package keyworddriven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Assignment.Iautoconsts;

public class Sere implements Iautoconsts
{

	public static void main(String[] args) throws InterruptedException {
System.setProperty("GECKO_KEY","GECKO_VALUE");
WebDriver driver = new FirefoxDriver();
driver.get("http://ts.ida-hk.com:81/login.do");
Thread.sleep(3000);
//WebElement untb = driver.findElement(By.id("username"));
//driver.navigate().refresh();
//Thread.sleep(3000);
//untb.sendKeys("admin");
Loginpage lp=new Loginpage(driver);
lp.getuntb().sendKeys("admin");
lp.getpwd().sendKeys("manager");
lp.getbut().click();
//lp.setuntb("admin");

	}

}
