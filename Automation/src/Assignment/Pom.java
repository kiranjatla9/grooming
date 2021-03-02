package Assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	@FindBy(xpath="//a[text()='Authors' and @class='txnav']") private WebElement authLink;
	@FindBy(xpath="//h2[text()='Explore Inspirational Quotes by Famous Authors']/..//a[@class=\"bq_on_link_cl\"]") private List<WebElement> authors;
	@FindBy(xpath="//span[@class=\"authorContentName\"]") private List<WebElement> allauthors;
	@FindBy(xpath="//a[contains(@class,'b-qt qt')]") private List<WebElement> allquotes;
	//utilization
	public WebElement getAuthLink() {
		return authLink;
		}
	public void clickAuthLink() {
		authLink.click();
		}
	public  List<WebElement> getauthors() {
		return authors;
		}
	public List<WebElement> getallauthors() {
		return allauthors;
		}
	public void clickreadauthor(String authorName)
	{
		for(int i=0;i<allauthors.size();i++) {
			String readAuthor=allauthors.get(i).getText();
			if(readAuthor.equalsIgnoreCase(authorName))
			{
				allauthors.get(i).click();
			}
		}
	}
	public List<WebElement> getallquotes() {
		return allquotes;
		}
	public void printquotes()
	{
		for(WebElement quote:allquotes) {
			System.out.println(quote.getText());
		}
}
	public Pom() {
		PageFactory.initElements(BaseTEst.driver,this);
		
	}
}
