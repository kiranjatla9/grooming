package keyworddriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(name="username") private WebElement untb;
	@FindBy(name="password") private WebElement pwd;
	@FindBy() private WebElement but;
	//initialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getuntb() {
		return untb;
	}
	public WebElement getpwd()
	{return pwd;
	}
	public WebElement getbut() {
		return but;
	}
	}
