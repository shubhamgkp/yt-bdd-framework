package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) //This is for to run testrunner with junit
@CucumberOptions(

		features = "src/test/java/features",
		glue = "stepDefinitions"
		)

public class TestRunner extends AbstractTestNGCucumberTests{


}
