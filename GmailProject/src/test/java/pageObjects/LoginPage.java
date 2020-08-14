package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (name = "identifier")
	private WebElement usernameTxtBx;
	
	@FindBy (className = "VfPpkd-RLmnJb")
	private WebElement nextBtn;
	
	@FindBy (name = "password")
	private WebElement passwordTxtBx;
	
		
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTxtBx() {
		return usernameTxtBx;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public WebElement getPasswordTxtBx() {
		return passwordTxtBx;
	}

}