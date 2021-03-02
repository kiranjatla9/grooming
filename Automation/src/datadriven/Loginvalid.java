package datadriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class Loginvalid extends Basetest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		Basetest bt=new Basetest();
		bt.openbrowser();
		 fileLib flib = new fileLib();
		 Thread.sleep(3000);
		 String un=flib.getCellData(EXCEL_PATH,"sheet3",1,0);
		 String pwd=flib.getCellData(EXCEL_PATH,"sheet3",1,1);
		 driver.findElement(By.id("username")).sendKeys(un);
		 driver.findElement(By.name("pwd")).sendKeys(pwd);
		 driver.findElement(By.xpath("//div[text()='Login']")).click();
		 

	}

}
