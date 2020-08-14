package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "features",
 glue= {"stepDefinition"},
// tags = "@Scenario",
 plugin = {"html:target/htmlReport/","json:target/jsonReports/cucumber-report.json"},
 monochrome = true
 ) 

public class TestRunner{
}
