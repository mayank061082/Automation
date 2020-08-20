package CucumberOptions;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		 features ="features",
		 glue= {"StepDefnition"},
		plugin = {"pretty","html:target/test-outout", "json:/target/json_output/cucumber.json", "junit:target/junit_xml/cucumber.xml"},
		 monochrome = true,
		//strict = true,
		 dryRun = false
		 ) 
		
		public class TestRunner {

}
