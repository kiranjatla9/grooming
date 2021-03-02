package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class assignment {

	private static final String oneopt = null;
	private static final String Select = null;
	private static List<WebElement> ddaddr;
	private static WebElement alselop;
	
	private static Object ddar;
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);

		WebElement ddr = driver.findElement(By.name("q"));
		ddr.sendKeys("laptops");
		 
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class=\"xOS6RD\"]"));
		
		System.out.println(alloptions.size());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		alloptions.get(alloptions.size()-1).click();
		
		WebElement kkr=driver.findElement(By.xpath("//div[@c=\"\"]/following-sibling::div[@class=\"_1YoBfV\"]"));
		System.out.println(kkr.getSize());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Select s1=new Select(kkr);
		s1.selectByValue("50000");
		kkr.click();

	
		
	
		

		
//		System.out.println((((WebElement) alloptions).getText()));
//		for(WebElement oneopt:alloptions);
//		alloptions=s.getOptions();
//		System.out.println(oneopt:gettext());
//		alselop=s.getFirstSelectedOption();
//		alselop.click();
	}}