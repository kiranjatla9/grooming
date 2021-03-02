package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	@Test
	public void verify() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle,"Google");
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals("ActualTitle","Goog");
//		sa.assertAll();
		driver.findElement(By.name("q")).sendKeys("NTR");
	}

}
