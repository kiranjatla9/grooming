package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;

import Methoddriven.loginpage;

public class Sere extends BaseTest {
	public void login() {
		driver.get("http://190.210.184.180/login.do");
		loginpage lp=new loginpage(driver);
		driver.navigate().refresh();
		lp.getuntb().sendKeys("admin");
		Assert.fail();
	}

}
