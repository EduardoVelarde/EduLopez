package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FinalPage {
	
	public FinalPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[3]")
	WebElement tShirt;
	@FindBy(className="product-container")
	 WebElement el1;
	@FindBy(xpath ="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
	 WebElement addToCart;
	@FindBy(xpath ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	 WebElement proceed1;
	@FindBy(xpath ="//*[@id=\"center_column\"]/p[2]/a[1]")
	 WebElement prCh;
	@FindBy(xpath ="//*[@id=\"center_column\"]/form/p/button")
	 WebElement prCh2;
	@FindBy(id ="uniform-cgv")
	 WebElement agreedTer;
	@FindBy(xpath ="//*[@id=\"form\"]/p/button")
	 WebElement prCh3;
	@FindBy(xpath ="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	 WebElement payBank;
	@FindBy(xpath ="//*[@id=\"cart_navigation\"]/button")
	 WebElement conOrd;
	
	
	public void tShirt() {
		tShirt.click();
	}

	public void addToCart() {
		el1.click();
		addToCart.click();
	}
	public void proceed1() {
		proceed1.click();
	}
	public void prCh() {
		prCh.click();
	}
	public void prCh2() {
		prCh2.click();
	}
	public void agreedTer() {
		agreedTer.click();
	}
	public void prCh3() {
		prCh3.click();
	}
	public void payBank() {
		payBank.click();
	}
	public void conOrd() {
		conOrd.click();
	}
	
	
}
