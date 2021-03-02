package keyworddriven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Assignment.FileLib;
import Assignment.Iautoconsts;

public class Basetest implements Iautoconsts {

	public static WebDriver driver;
		public void openbrowser() throws IOException, InterruptedException {
			FileLib flib=new FileLib();
			String browser = flib.getpropkeyvalue(PROP_PATH,"browser");
			System.out.println(browser);
			if(browser.equals("firefox")) {
					Thread.sleep(3000);
				System.setProperty(GECKO_KEY,GECKO_VALUE);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				String appurl = flib.getpropkeyvalue(PROP_PATH,"url");
				driver.get(appurl);
			}
			else if(browser.equals("Chrome"))
			{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.get("https://demo.actitime.com/login.do");
			String appurl = flib.getpropkeyvalue(PROP_PATH,"url");
			driver.get(appurl);
			}
	
		}
	public void closebrowser() {
		driver.quit();
	}
	}