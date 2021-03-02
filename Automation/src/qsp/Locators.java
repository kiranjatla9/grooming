package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/KIRAN/Documents/kir.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Locators - Static methods of abstract 'by' class
		// WebElement ele=driver.findElement(By.tagName("a"));
		//System.out.println(ele);
		//ele.click();
		//driver.findElement(By.id("i2")).click();
	driver.findElement(By.name("n2")).click();
		//driver.findElement(By.className("c2")).click();
	    //driver.findElement(By.linkText("facebook")).click();
		//<a>Inbox(30)</a> partially dynamic link
	//driver.findElement(By.linkText("Inbox(25)")); //wrong
		//what is patially dynamic link
		//Link in which a part of it is static and part of it is dynamic
		// How to handle partially dynamic link?
		// By using partiallyLinktext, partiallyLinktext means part of the completer linktext
		// where we use static part and ignore dynamic part
	//driver.findElement(By.partialLinkText("Inbox"));
		// Bhanuprakasha - LinkText
		 //Partiallinktext
		//Bhanu
		//prakash
		//akash
		//asha
		//anu
		//anup
		//driver.FindElement(By.partiallyLinkText("akash")
		
	}

}
