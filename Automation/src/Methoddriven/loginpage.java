package Methoddriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
		//Declaration
		@FindBy(name="username") private WebElement untb;
		@FindBy(name="password") private WebElement pwd;
		@FindBy() private WebElement but;
		//initialization
		public loginpage(WebDriver driver)
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
