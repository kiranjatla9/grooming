package Hybrid_dd_kd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpa {

		 	@FindBy(name="username") private WebElement untb2;
			@FindBy(name="password") private WebElement pwd2;
			@FindBy() private WebElement but2;
			//initialization
			public loginpa(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			public Object getuntb2() {
				// TODO Auto-generated method stub
				return untb2;
			}
			public Object getpwd2() {
				// TODO Auto-generated method stub
				return pwd2;
			}}
			//utilization
