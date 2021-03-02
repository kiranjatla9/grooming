package TestNG;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebdriverCommonLibrary<TakesScreenshot> extends BaseTest {
	public String getPageTitle() {
		String title=driver.getTitle();
		return title ;
	}
public void SelectOption(WebElement element,String text) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}
public void SelectOption(String value,WebElement element) {
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public void SelectOption(WebElement element,int index) {
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
public void switchToFrame(WebElement element) {
driver.switchTo().frame(element);	
}	
public void mousehover(WebElement element) {
	Actions ac=new Actions(driver);
	ac.moveToElement(element).perform();
}
public void waitforelementvisibility(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void waitforpageTitle(String element) {
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.titleContains(element));
}
public void verifypage(String pageName) {
	Assert.fail();
	Reporter.log(pageName+"is displayed",true);
}
public void getpagescreenshot(String path) throws IOException {
 EventFiringWebDriver ef = (EventFiringWebDriver)driver;
 File src = ef.getScreenshotAs(OutputType.FILE);
 File f=new File(path);
 Files.copy(src,f);
}
}
