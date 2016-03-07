package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		//plugin = {"pretty", "html:target/cucumber-html-report"},	
		plugin = {"pretty", "json:target/cucumber.json"},
		features = "src/test/resources/",
		//tags = ("@inbox, @logoutNewUser"),
		glue={"TestCases"},
		dryRun = false,
		monochrome = true
		)

public class CucumberRunnerTest 
{

}
