package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[@class='ml-2'][normalize-space()='Login']")
	WebElement login;
	
	@FindBy(xpath="//input[@placeholder='User']")
	WebElement user;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//span[normalize-space()='Submit']")
	WebElement submit;
	
	
	public void click_login() {
		login.click();
	}
	public void setuser(String userid) {
		user.sendKeys(userid);
	}
	public void setpassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void click_submit() {
		submit.click();
	}
}
