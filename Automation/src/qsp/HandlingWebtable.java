package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.get("file:///C:/Users/KIRAN/Documents/webtable.html");
		List<WebElement> alltds = driver.findElements(By.tagName("td"));
		System.out.println("Total td's:" +alltds.size());
		WebElement table2 = driver.findElement(By.id("t2"));
		List<WebElement> table2tds =table2.findElements(By.tagName("td"));
		System.out.println("td's inside table2:" +table2tds.size());
		System.out.println(driver.findElement(By.tagName("td")).getText());
		WebElement tab2 = driver.findElement(By.id("t2"));
		System.out.println(tab2.findElement(By.tagName("td")).getText());
		WebElement ro2 = driver.findElement(By.xpath("/table[@id='t2']//tr[2]"));
		System.out.println(ro2.findElements(By.tagName("td")).size());
		driver.get("file:///C:/Users/KIRAN/Documents/webtable.html");
		System.out.println(driver.findElements(By.xpath("//table[@id='t1']//tr[*]/td[5]")).size());
		
		
		
	}

}
