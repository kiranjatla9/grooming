package Hybrid_dd_kd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Methoddriven.loginpage;

public class actitimelogin {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ts.ida-hk.com:81/login.do");
		loginpa lp=new loginpa(driver);
		driver.navigate().refresh();
		lp.getuntb2();
		lp.getpwd2();
	}

}
