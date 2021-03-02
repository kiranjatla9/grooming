package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class handlingchildbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.naukri.com/");
//		1.can you close a parent browser window only??
		driver.close();
//		2.can you close all the browser windows at one??
		driver.quit();
//		3.can you close all the browser windows without using quit();??
////		Set<String> allwhs = driver.getWindowHandles();
//		System.out.println(allwhs.size());
//		for(String wh:allwhs)
//		{
//			driver.switchTo().window(wh);
			driver.close();
//		}
//	4.can you perform action on a particular browser??
//		Set<String> allwhs = driver.getWindowHandles();
//		for(String wh:allwhs)
//		{
//			String title = driver.switchTo().window(wh).getTitle();
//		if(title.equals("Cognizant"))
//		{Thread.sleep(3000);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.close();
//		break;
//		}
//		}
//		5.can you close all the child browser only??
		String parentTitle = driver.getTitle();
		Set<String> allwhs = driver.getWindowHandles();
		for(String wh:allwhs)
		{
		driver.switchTo().window(wh).getTitle();
		if(parentTitle.equals(parentTitle))
		{System.out.println("dont touch me iam parent");
		} else 
		{driver.close();
		
		}
		}
	}
	}
