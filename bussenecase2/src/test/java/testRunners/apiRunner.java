package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/main/resources/ApiFeatureFile",
		glue = {"apiStepDefinition"}
		)
public class apiRunner extends AbstractTestNGCucumberTests {

}
