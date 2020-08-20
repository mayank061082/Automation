package StepDefnition;

//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import Utils.Base;
import io.cucumber.java.Before;

public class Hooks {
public WebDriver driver;
	
	@Before
	public void beforeScenario() {
		driver = Base.getDriver();
	}
	
}
