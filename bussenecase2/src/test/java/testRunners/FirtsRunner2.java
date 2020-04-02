package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.TestNG;

@CucumberOptions(
		features= "C:\\Users\\test.admin\\Cucumber\\bussenecase2\\src\\main\\resources\\features",
		glue = {"stepDefinition"},
 
		tags= {"@Home"}
		)


public class FirtsRunner2 extends AbstractTestNGCucumberTests {


}
