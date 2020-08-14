package stepDefinition;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GmailHomePage;
import pageObjects.LoginPage;
import utils.Base;
import utils.ComposeMailScreen;
import utils.GenericLib;
import utils.WaitStatementLib;
import utils.WriteExcelFile;

public class Gmail {
	WebDriver driver = Base.driver;
	LoginPage lp = new LoginPage(driver);
	GmailHomePage ghp = new GmailHomePage(driver);
	ComposeMailScreen cmsc = new ComposeMailScreen();
	Screen screen = new Screen();
	
	@Given("^I navigate to the gmail login page$")
	public void i_navigate_to_the_gmail_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://mail.google.com/");
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WaitStatementLib.eWaitforVisible(lp.getUsernameTxtBx(), driver, 5);
		lp.getUsernameTxtBx().sendKeys(arg1);
	}

	@When("^click on next button$")
	public void click_on_next_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WaitStatementLib.eWaitForClickable(lp.getNextBtn(), driver, 5);
		lp.getNextBtn().click();
	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WaitStatementLib.eWaitforVisible(lp.getPasswordTxtBx(), driver, 5);
		lp.getPasswordTxtBx().sendKeys(arg1);
	}

	@Given("^I am on gmail home page$")
	public void i_am_on_gmail_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WaitStatementLib.eWaitForClickable(ghp.getComposeBtn(), driver, 10);
		assertTrue(ghp.getComposeBtn().isDisplayed());
	}

	@When("^I read first unread mail$")
	public void i_read_first_unread_mail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		List<WebElement> unreadMails = ghp.getUnreadMails();
		unreadMails.get(0).click();
	}

	@Then("^I should able to write subject and mailbody to the excel file$")
	public void i_should_able_to_write_subject_and_mailbody_to_the_excel_file() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WaitStatementLib.eWaitforVisible(ghp.getSubjectText(), driver, 5);
		String subject = ghp.getSubjectText().getText();
		String mailBody = ghp.getMailBody().getText();
		String[] info = { subject, mailBody };
		WriteExcelFile.writeValuesToExcel(info);
	}

	@When("^i compose a mail$")
	public void i_compose_a_mail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WaitStatementLib.eWaitforVisible(ghp.getComposeBtn(), driver, 5);
		ghp.getComposeBtn().click();
	}

	@When("^Add \"([^\"]*)\" mail id from property file$")
	public void add_mail_id_from_property_file(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String email = GenericLib.getValue(arg1);
		screen.wait(cmsc.getToTxtBx(), 10);
		screen.type(cmsc.getToTxtBx(), email);

	}

	@When("^Add Subject as \"([^\"]*)\"$")
	public void add_Subject_as(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
		screen.wait(cmsc.getSubjectTxtBx(), 10);
		screen.find(cmsc.getSubjectTxtBx());
		screen.type(cmsc.getSubjectTxtBx(), arg1);
		}
		catch(FindFailed f) {
			screen.wait(cmsc.getIdExistComposeBtn(), 10);
			screen.find(cmsc.getIdExistComposeBtn());
			screen.type(cmsc.getIdExistComposeBtn(), arg1);
		}
	}

	@When("^attach a file$")
	public void attach_a_file() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		screen.wait(cmsc.getAttachmentLnk(), 10);
		screen.click(cmsc.getAttachmentLnk());
		WaitStatementLib.isleep(5);
		try {
			Runtime.getRuntime().exec(".\\testData\\FileUpload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		WaitStatementLib.isleep(5);
	}

	@When("^click on send button$")
	public void click_on_send_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		screen.wait(cmsc.getSendBtn(), 20);
		screen.click(cmsc.getSendBtn());
	}

	@Then("^should able to send the mail$")
	public void should_able_to_send_the_mail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		WaitStatementLib.eWaitforVisible(ghp.getSuccessToast(), driver, 5);
		assertTrue(ghp.getSuccessToast().isDisplayed());
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
	}

}
