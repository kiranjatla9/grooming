package keyworddriven;

import java.io.IOException;
import org.openqa.selenium.By;

import Assignment.FileLib;

public class validLogin extends Basetest {

	public static void main(String[] args) throws IOException, Throwable {
		Basetest bt=new Basetest();
		bt.openbrowser();
		FileLib flib=new FileLib();
		Thread.sleep(3000);
		String un = flib.getpropkeyvalue(PROP_PATH,"username");
		String pwd = flib.getpropkeyvalue(PROP_PATH,"password");
		driver.findElement(By.id("username")).sendKeys("un");
		driver.findElement(By.name("pwd")).sendKeys("pwd");	
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		

	}

}
