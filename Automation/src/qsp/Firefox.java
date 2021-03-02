package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.Google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//String pgsrc=driver.getPageSource();
		//System.out.println(pgsrc);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			System.out.println("Google is dispalyed,test step passed");
		}
		else
		{
			System.out.println("Google is not dispalyed,test step failed");
		}}}