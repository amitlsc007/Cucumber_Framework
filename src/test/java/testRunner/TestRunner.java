package testRunner;

//This is my test runner class

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/",
		glue="stepDefinitions",
		monochrome=true,
		tags= {"@sanity,@regression"},   //Or means scenario fall under either sanity and regression
		//tags= {"@sanity","@regression"},   //And means scenario fall under both sanity and regression
		plugin= {"pretty","html:test-output"}
		)

public class TestRunner {

}
