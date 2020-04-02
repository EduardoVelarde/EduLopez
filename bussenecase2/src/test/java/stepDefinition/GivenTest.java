package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageObjects.LoginInPage;

public class GivenTest {
	LoginInPage lg;
	public static WebDriver driver = SetUpClass.driver;
	
	
	@Given("User is on Home page")
	 public void user_is_on_login_page() {
	     // Write code here that turns the phrase above into concrete actions
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		
	 }
	@Given("User is on logged")
	public void user_is_on_logged() {
		
		lg =new LoginInPage(driver);
		lg.login(driver);
	}

}
