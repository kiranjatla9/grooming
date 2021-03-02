package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("start-maximized");
		//open chrome browser with the settings
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("DepartDate").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//td[@datamonth=\"10\"]//a[text()='4']").click();
		
	}

}
