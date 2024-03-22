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
	
	@FindBy(xpath="//a[@href='/banking/self/payment']//div[@class='quick-access-icon']//icon//*[name()='svg']")
	WebElement payuser;
	
	@FindBy(xpath="//input[@placeholder='Type to search']")
	WebElement search;
	
	@FindBy(xpath="//input[@id='id_3']")
	WebElement amount;
	
	@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	WebElement next;
	
	@FindBy(xpath="//span[normalize-space()='Confirm']")
	WebElement confirm;
	
	
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
	public void click_payuser() {
		payuser.click();
	}
	public void setsearchvalue(String contactname) {
		search.sendKeys(contactname);	
	}
	public void setamount(String amnt) {
		amount.sendKeys(amnt);
	}
	public void click_next() {
		next.click();
	}
	public void click_confirm() {
		confirm.click();
	}
}
