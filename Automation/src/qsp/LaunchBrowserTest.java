package qsp;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchBrowserTest {
	public static void main(String args[]) throws InterruptedException
	{	
		//set system property
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		new ChromeDriver().close();
	   System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
	   FirefoxDriver driver = new FirefoxDriver();
	   driver.quit();
	   Thread.sleep(5000);
	   driver.close();
	}
}