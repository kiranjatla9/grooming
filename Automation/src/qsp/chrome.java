package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chrome
{
public static void main(String args[])
{
System.setProperty("webdriver.chrome.driver","E:\\sel\\Automation\\drivers\\chromedriver.exe");
 new ChromeDriver();
}
}