package Hybrid_dd_kd;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Assignment.FileLib;

public class Basetest implements Iautoconstants {
		public static WebDriver driver;
		public void openbrowser() throws IOException {
			Filelib flib=new Filelib();
			String Browser = flib.readpropdata(PROP_PATH,"browser");
			System.out.println(Browser);
			if(Browser.equals("firefox")) {
				System.setProperty(GECKO_KEY,GECKO_VALUE);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				String appurl = flib.readpropdata(PROP_PATH,"url");
				driver.get(appurl);
			}
			else if(Browser.equals("chrome"))
			{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			String appurl = flib.readpropdata(PROP_PATH,"url");
			driver.get(appurl);
			}
	
		}
	public void closebrowser() {
		driver.quit();
	}

}
