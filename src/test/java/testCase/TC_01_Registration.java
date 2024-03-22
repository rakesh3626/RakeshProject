package testCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.HomePage; 
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_01_Registration extends BaseClass{
	@Test
	public void Acc_Registration() throws InterruptedException {
	
	HomePage hpage=new HomePage(driver);
	RegistrationPage rpage=new RegistrationPage(driver);
	logger.info("*********application logs********");
	logger.info("*********Clicking on my account********");
	
	hpage.click_My_acct();
	
	rpage.setname(RB.getString("name"));
	rpage.setLoginname(RB.getString("Loginname"));
	rpage.setEmail(RB.getString("emailid"));
	rpage.setwebsite(RB.getString("sitename"));
	rpage.click_gender();
	rpage.setmobileno(RB.getString("mobile"));
	rpage.click_next();
	
	rpage.setpassword(RB.getString("pwd"));
	rpage.setconfpasword(RB.getString("cpwd"));
	rpage.click_democheckbox();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
	Thread.sleep(2000);
	
	rpage.click_recaptcha();
	rpage.click_submit();
	
	
	}
}
