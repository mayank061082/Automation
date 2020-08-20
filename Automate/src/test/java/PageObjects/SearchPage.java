package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.sikuli.script.Pattern;

public class SearchPage {
	// Locator for From Source
	@FindBy(xpath = "//span[contains(text(),'From')]")
	private WebElement searchFrom;
	@FindBy( xpath ="//input[contains(@placeholder,'From')]")
	private WebElement fromtextBx;
	@FindBy(xpath ="//div//p[text()='Mumbai, India']")  //(//div[@class='calc60'])[1]
	private WebElement firstSelection;
	
	// Locator for To Destination
	@FindBy(xpath ="//span[contains(text(),'To')]")
	private WebElement searchTo;
	@FindBy( xpath ="//input[contains(@placeholder,'To')]")
	private WebElement totextBx;
	@FindBy (xpath ="//div//p[text()='Goa, India']")
	private WebElement firsttoSelection;

	public SearchPage(WebDriver driver){	
	PageFactory.initElements(driver, this);
		}

	public WebElement getSearchFrom() {
		return searchFrom;
	}

	public WebElement getFromtextBx() {
		return fromtextBx;
	}

	public WebElement getSearchTo() {
		return searchTo;
	}

	public WebElement getFirstSelection() {
		return firstSelection;
	}

	public WebElement getTotextBx() {
		return totextBx;
	}

	public WebElement getFirsttoSelection() {
		return firsttoSelection;
	}

	

	
	
}
