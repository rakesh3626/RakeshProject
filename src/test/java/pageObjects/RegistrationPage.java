package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath="//input[@id='id_1']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='id_2']")
	WebElement Loginname;
	
	@FindBy(xpath="//input[@id='id_3']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='website']")
	WebElement website;
	
	@FindBy(xpath="//label[normalize-space()='Male']")
	WebElement btn_gender;
	
	@FindBy(xpath="//input[@id='id_4']")
	WebElement mobile_no;
	
	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement btn_next;
	
	@FindBy(xpath="//input[@id='id_7']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='id_8']")
	WebElement cnfm_password;
	
	@FindBy(xpath="//label[@for='id_9']")
	WebElement demo_checkbox;
	
	@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]/div[1]")
	WebElement recaptcha;
	
	@FindBy(xpath="//span[normalize-space()='Submit']")
	WebElement btn_submit;
	
	public void setname(String fname) {
		name.sendKeys(fname);
	}
		public void setLoginname(String lname) {
			Loginname.sendKeys(lname);
			
		}
		
		public void setEmail(String emailid) {
			Email.sendKeys(emailid);
		}
		public void setwebsite(String sitename) {
			website.sendKeys(sitename);
		
	}
		public void click_gender() {
			btn_gender.click();;
		
	}
		public void setmobileno(String mobile) {
			mobile_no.sendKeys(mobile);
		}
		public void click_next() {
			btn_next.click();
		}
		public void setpassword(String pwd) {
			password.sendKeys(pwd);;
		}
		public void setconfpasword(String cpwd) {
			cnfm_password.sendKeys(cpwd);;
		}
		public void click_democheckbox() {
			demo_checkbox.click();
		}
		public void click_recaptcha() {
			recaptcha.click();
		}
		public void click_submit() {
			btn_submit.click();
		}
	
}



