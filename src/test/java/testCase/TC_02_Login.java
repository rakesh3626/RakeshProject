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
	lp.click_payuser();
	lp.setsearchvalue(RB.getString("contactname"));
	lp.setamount(RB.getString("amnt"));
	Thread.sleep(2000);
	lp.click_next();
	lp.click_confirm();
	
	}
}
