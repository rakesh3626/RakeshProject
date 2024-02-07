package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[@class='panel header']//a[text()='Create an Account']")
	WebElement Create_acct;
	
	public void click_My_acct() {
		Create_acct.click();
		
	}
	
}

