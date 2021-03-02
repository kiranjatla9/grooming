package qsp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/KIRAN/Documents/username.html");
//index-->index starts from 0
//driver.switchTo().Frame(0);
//String arg-->id or name of the Frame
//driver.SwitchTo().Frame("frid");
//driver.SwitchTo().Frame("frnm");
//if other attribute values are given
// like driver.SwitchTO().Frame("frcl");//NoSuchElementException because "frcl" is a class
WebElement frAddr = driver.findElementByClassName("frcl");
driver.switchTo().frame(frAddr);
Thread.sleep(3000);
driver.findElementById("pwd").sendKeys("manager");
//Switching from a Frame to its immediate parent frame
//driver.SwitchTo().Parentframe();
driver.switchTo().defaultContent();
Thread.sleep(3000);
driver.findElementById("un").sendKeys("admin");
	}
	}

