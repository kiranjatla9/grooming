package qsp;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		//enter the url 
		driver.get("https://www.Google.com");
		//to maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//enter the url
		driver.navigate().to("https://accounts.google.com/");
		Thread.sleep(3000);
		//navigate to previous page
		driver.navigate().back();
		Thread.sleep(3000);
		//navigate to next page
		driver.navigate().forward();
		Thread.sleep(3000);
		//navigate to refresh the page
		driver.navigate().refresh();
//method chaining:by the help of windows method calling maximize method
		
		
		//return type of current method should be same as parent of next method
		
		
		// parent of manage method is webDriver-->driver is the return type of webDriver
		//return type of window is options and window parent is options
		//return type of Window method is Window interface 
		// maximize is the one of the methods 
        // maximize return type is void
		// parent of maximize is window
		
		//to maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//to set the size of the browser
		Dimension d=new Dimension(600,200);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		//to set the position of the browser
		Point p=new Point(500,600);
		driver.manage().window().setPosition(p);
		Thread.sleep(999999999);
		
		//to remove all the history(or)cookies stored by the browser:like Incognito tab in Google(or)Chrome
		driver.manage().deleteAllCookies();
		
		//driver.get is used to enter the test url
		//and also navigate  is the another way to test url
		//driver.navigate().to("https://accounts.google.com/");
	}

}
