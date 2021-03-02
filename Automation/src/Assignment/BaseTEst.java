package Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import datadriven.Iautoconsts;
import qsp.chrome;

public class BaseTEst implements Iautoconsts {
	public static WebDriver driver;
	public void openbrowser() throws IOException  {
		FileLib flib = new FileLib();
		String browser = flib.getpropkeyvalue(PROP_PATH,"browser1");
		System.out.println("browser");
		if(browser.equals("chrome")) {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
		//manage().window().maximize();
		}
		else if(browser.equals("firefox")) {
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
		System.out.println("Dabba Fellow,Give Correct Browser Name,...");
		{
	String appurl=FileLib.getpropkeyvalue(PROP_PATH,"BqUrl");
	driver.get(appurl);
		}}
public void closebrowser() {
	driver.quit();
}
}


