package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_02_Login extends BaseClass{
	@Test
	public void acc_login() throws InterruptedException {
	
	LoginPage lp=new LoginPage(driver);
	
	lp.click_login();
	lp.setuser(RB.getString("userid"));
	lp.setpassword(RB.getString("pwd"));
	lp.click_submit();	
	}
}
