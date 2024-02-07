package testCase;

import org.junit.Assert; 
import org.testng.annotations.Test;

import pageObjects.HomePage; 
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_01_Registration extends BaseClass{
	@Test(invocationCount=3)
	public void Acc_Registration() {
	
	HomePage hpage=new HomePage(driver);
	RegistrationPage rpage=new RegistrationPage(driver);
	logger.info("*********application logs********");
	logger.info("*********Clicking on my account********");
	
	hpage.click_My_acct();
	
	rpage.setFirstname(RB.getString("firstname"));
	rpage.setLastname(RB.getString("lastname"));
	rpage.setPassword(RB.getString("password"));
	rpage.setEmail(RB.getString("email"));
	rpage.setCnfmPassword(RB.getString("confirmPassword"));
	rpage.click_Createacct();
	
	Assert.assertTrue(false);
	
	}
}
