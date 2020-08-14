package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.ScreenShotLib;

public class Hooks {
	public WebDriver driver;
	
	@Before
	public void beforeScenario() {
		driver = Base.getDriver();
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
				ScreenShotLib ss = new ScreenShotLib();
				ss.takeScreenshot(driver, scenario.getName().replaceAll(" ", "_"));
		}
	}
}
