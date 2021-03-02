package datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import qsp.chrome;

public class Basetest implements Iautoconsts {

	public static WebDriver driver;
		public void openbrowser()  {
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
	
		}
	public void closebrowser() {
		driver.quit();
	}
	}