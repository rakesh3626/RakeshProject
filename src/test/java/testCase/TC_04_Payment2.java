package testCase;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.PaymentPage;
import testBase.BaseClass;

public class TC_04_Payment2 extends BaseClass {
	@Test
	public void payment2() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage lp=new LoginPage(driver);
		PaymentPage pp=new PaymentPage(driver);
		Thread.sleep(3000);
		lp.click_login();
		lp.setuser(RB.getString("userid"));
		lp.setpassword(RB.getString("pwd"));
		lp.click_submit();
		Thread.sleep(4000);
		pp.click_payuser();
		pp.click_contacts();
		pp.click_goldentravels();
		Thread.sleep(4000);
		pp.setamount(RB.getString("amnt"));
		Thread.sleep(4000);
		pp.click_payoptions();
		pp.click_scheduled();
		Thread.sleep(4000);
		pp.setdate(RB.getString("sdate"));
		Thread.sleep(5000);
		Actions act=new Actions(driver); 
	    act.click(driver.findElement(By.xpath("//span[normalize-space()='Next']"))).perform();
	    Thread.sleep(4000);
	    pp.click_previous();
	    Thread.sleep(4000);
	    pp.setchangeamnt(RB.getString("amnt_change"));
	    act.click(driver.findElement(By.xpath("//span[normalize-space()='Next']"))).perform();
	    Thread.sleep(4000);
	    pp.click_confirm();
	    logger.info(".......confirm........");
	    Thread.sleep(4000);
	    WebElement ele=driver.findElement(By.xpath("//div[@class='content-title d-flex']//heading-actions//button[@type='button']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(ele).click().perform();
		logger.info("..........save........");

	    }

}
