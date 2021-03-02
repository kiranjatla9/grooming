package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	public static WebDriver driver; 
	@Parameters("browser")
	@Test
	public void runbrowser(String browser) {
		System.out.println(browser);
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
}
else if(browser.equals("firefox"))
{
System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
WebDriver driver = new FirefoxDriver();
}
else {
	System.out.println("Dabba Fellow,Give Correct browser name,,,...");
}
}}
