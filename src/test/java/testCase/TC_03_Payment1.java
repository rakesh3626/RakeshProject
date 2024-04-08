package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.PaymentPage;
import testBase.BaseClass;

public class TC_03_Payment1 extends BaseClass{
	@Test
	public void Payment1 () throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		PaymentPage pp=new PaymentPage(driver);
		Thread.sleep(5000);
		lp.click_login();
		lp.setuser(RB.getString("userid"));
		lp.setpassword(RB.getString("pwd"));
		lp.click_submit();
		Thread.sleep(4000);
		pp.click_payuser();
		pp.click_contacts();
		Thread.sleep(4000);
		pp.click_goldentravels();
		pp.setamount(RB.getString("amnt"));
		Thread.sleep(4000);
		Actions act=new Actions(driver); 
	    act.click(driver.findElement(By.xpath("//span[normalize-space()='Next']"))).perform();
	    pp.click_confirm();
	    logger.info("........click_next...........");
	    Thread.sleep(4000);
	    WebElement ele=driver.findElement(By.xpath("//div[@class='content-title d-flex']//heading-actions//button[@type='button']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(ele).click().perform();
		logger.info("........save.........");
	}

}
