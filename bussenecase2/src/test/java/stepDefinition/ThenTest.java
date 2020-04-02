package stepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenTest {
	WebDriver driver =GivenTest.driver;
	 @Then("User should be logged correctly")
	 public void user_should_be_logged_correctly() {
	     // Write code here that turns the phrase above into concrete actions
		
		Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"));
	
	 }
	 
	 @Then("Your order on My Store is complete")
	 public void your_order_on_My_Store_is_complete() {
		//*[@id="center_column"]
	     // Write code here that turns the phrase above into concrete actions
		WebElement lb= driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
		 Assert.assertTrue(lb.getText().equals("ORDER CONFIRMATION"));
	 }

	 /**
	 * 
	 */
	@Then("User should not be logged correctly")
	public void user_should_not_be_logged_correctly() { 
		WebElement lb = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
		lb.click();
		
		}



}
