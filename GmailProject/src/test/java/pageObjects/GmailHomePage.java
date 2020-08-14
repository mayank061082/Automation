package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage {

	@FindBy(xpath = "//div[text()='Compose']")
	private WebElement composeBtn;
	
	@FindBy(xpath = "//tr[contains(@class,'zA zE')]")
	private List<WebElement> unreadMails;
	
	@FindBy(xpath = "//h2[contains(@class,'hP')]")
	private WebElement subjectText;
	
	@FindBy(xpath = "(//div[contains(@class,'a3s aXjCH ')])[1]")
	private WebElement mailBody;
	
	@FindBy(xpath= "//span[contains(text(),'Message sent.')]")
	private WebElement successToast;
	
	public GmailHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getComposeBtn() {
		return composeBtn;
	}

	public List<WebElement> getUnreadMails() {
		return unreadMails;
	}

	public WebElement getSubjectText() {
		return subjectText;
	}

	public WebElement getMailBody() {
		return mailBody;
	}

	public WebElement getSuccessToast() {
		return successToast;
	}
	

}
