package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.When;
import pageObjects.FinalPage;
import pageObjects.LoginInPage;

public class WhenTest {
	LoginInPage lg;
	FinalPage fp;
	WebDriver driver = GivenTest.driver;
	
	
	 @When("User enters username as {string}")
	 public void user_enters_username_as(String email) {
		 lg =new LoginInPage(driver);
		 lg.sendEmail(email);
	 }

	 @When("User enters password as {string}")
	 public void user_enters_password_as(String password) {
	   lg.sendPass(password);
	 }

	 @When("User click on sign in button")
	 public void user_click_on_sign_in_button() {
	     lg.clicSubmit();
	     
	 }
	 @When("User click's an item")
	 public void user_click_s_an_item() {
	     
		 //WebElement element= driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]"));
	     //element.click();
		 fp = new FinalPage(driver);
		 fp.tShirt();
		 
	 }
	 @When("Click add to cart")
	 public void click_add_to_cart() {
//		 WebElement el3 = driver.findElement(By.className("product-container"));
//		    el3.click();
//		 WebElement elemennt2= driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
//	     elemennt2.click();
	    fp.addToCart();
	 }
	
	 
	 @When("click to proceed")
	 public void click_to_proceed() {
		
		 //WebElement el4 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		   // el4.click();
		 fp.proceed1();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	 }
	 @When("Proceed to checkout")
	 public void Proceed_to_checkout() {
		 //WebElement el5 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		   // el5.click();
		 fp.prCh();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			   
	 }
	 @When("Proceed to checkout2")
	 public void Proceed_to_checkout2() {
		 //WebElement el6 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
		    //el6.click();
		 fp.prCh2();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			   
	 }

	

	 @When("Click Agreed with term of use")
	 public void click_Agreed_with_term_of_use() {
	     // Write code here that turns the phrase above into concrete actions
		// WebElement el7 = driver.findElement(By.id("uniform-cgv"));
		    //el7.click();
		 fp.agreedTer();
		  
		    
	 }
	 @When("Proceed to checkout3")
	 public void Proceed_to_checkout3() {
		//*[@id="form"]/p/button//*[@id="form"]/p/button
		 
		 //WebElement el6 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
		   // el6.click();
		 fp.prCh3();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			   
	 }

	 @When("click Pay by Bank Wire")
	 public void click_Pay_by_Bank_Wire() {
		 //WebElement el6 = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		    //el6.click();
		 fp.payBank();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	 }

	 @When("I confirm my order")
	 public void i_confirm_my_order() {
	     // Write code here that turns the phrase above into concrete actions
		//*[@id="cart_navigation"]/button
		 //WebElement el6 = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		   // el6.click();
		 fp.conOrd();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	 }
	 

	 
	 
	 
}
