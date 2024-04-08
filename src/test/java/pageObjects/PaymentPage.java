package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/banking/self/payment']//div[@class='quick-access-icon']//icon//*[name()='svg']")
	WebElement payuser;
	
	@FindBy(xpath="//button[@class='btn btn-icon ml-2']")
	WebElement contacts;
	
	@FindBy(xpath="//a[normalize-space()='Golden Travels']")
	WebElement golden_travels;
	
	@FindBy(xpath="//input[@id='id_3']")
	WebElement amount;
	
	@FindBy(xpath="//div[@class='w-100']")
	WebElement pay_options;
	
	@FindBy(id="id_4_futureDate")
	WebElement scheduled;
	
	@FindBy(className = "select-option undefined level0 mt-1 selected")
	WebElement monthly_installments;
	
	@FindBy(className = "form-control w-100 text-right ng-pristine ng-invalid ng-touched")
	WebElement noof_instas;
	
	@FindBy(xpath="//label[normalize-space()='Now']")
	WebElement now;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement date;
	
	@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-outline-primary']")
	WebElement previous;
	
	@FindBy(className="form-control text-right ng-valid ng-dirty ng-touched")
	WebElement amount_change;
	
	@FindBy(xpath="//span[normalize-space()='Confirm']")
	WebElement confirm;
	
	@FindBy(xpath="//div[@class='content-title d-flex']//heading-actions//button[@type='button']")
	WebElement print_save;
	
	public void click_payuser() {
		payuser.click();	
	}
	public void click_contacts() {
		contacts.click();
	}
	public void click_goldentravels() {
		golden_travels.click();
	}
	public void setamount(String amnt) {
		amount.sendKeys(amnt);
	}
	public void click_payoptions() {
		pay_options.click();
	}
	public void click_scheduled() {
		scheduled.click();
	}
	public void click_monthinsta() {
		monthly_installments.click();
	}
	public void setnoof_instas(String ninstas) {
		noof_instas.sendKeys(ninstas);
	}
	public void click_now() {
		now.click();
	}
	public void setdate(String sdate) {
		date.sendKeys(sdate);
	}
	public void click_previous() {
		previous.click();
	}
	public void setchangeamnt(String amnt_change) {
		amount_change.sendKeys(amnt_change);
	}
	public void click_confirm() {
		confirm.click();
	}

}
