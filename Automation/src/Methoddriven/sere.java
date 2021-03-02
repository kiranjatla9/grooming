package Methoddriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyworddriven.Loginpage;

public class sere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://ts.ida-hk.com:81/login.do");
loginpage lp=new loginpage(driver);
driver.navigate().refresh();
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
lp.getuntb().sendKeys("admin");
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
lp.getpwd().sendKeys("manager");
	}

}
