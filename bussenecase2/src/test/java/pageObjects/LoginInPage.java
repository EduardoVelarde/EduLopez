package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInPage {
	
	public LoginInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "email")
	WebElement emailLbl;
	@FindBy(id = "passwd")
	WebElement passwdLbl;
	@FindBy(id = "SubmitLogin")
	WebElement submitBtn;
	@FindBy(xpath ="//*[@id=\\\"block_top_menu\\\"]/ul/li[3]")
	WebElement tShirt;
	public void sendEmail(String email) {
		emailLbl.sendKeys(email);
	}
	public void sendPass(String pass) {
		passwdLbl.sendKeys(pass);
	}
	public void clicSubmit() {
		submitBtn.click();
	}
	public void login(WebDriver driver) {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		sendEmail("test800@hotmail.com");
		sendPass("test123");
		clicSubmit();
		
	}
	
	
	public void tShirt() {
		
		tShirt.click();
	}
	
}
