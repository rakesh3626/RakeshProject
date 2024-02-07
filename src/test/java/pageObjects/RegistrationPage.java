package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath="//input[@id='firstname']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement Cnfm_Password;
	
	@FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	WebElement btn_Createacct;
	
	public void setFirstname(String fname) {
		Firstname.sendKeys(fname);
	}
		public void setLastname(String lname) {
			Lastname.sendKeys(lname);
			
		}
		
		public void setEmail(String emailid) {
			Email.sendKeys(emailid);
		}
		public void setPassword(String pwd) {
			Password.sendKeys(pwd);
		
	}
		public void setCnfmPassword(String pwd) {
			Cnfm_Password.sendKeys(pwd);
		
	}
		public void click_Createacct() {
			btn_Createacct.click();
		}
	
}



