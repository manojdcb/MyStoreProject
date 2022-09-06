package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PaymentPage extends BaseClass {
	
	@FindBy(xpath="//a[@class='bankwire']")	
	WebElement PayByBankWireBtn;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	WebElement orderSummaryText;

	public PaymentPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void clickOnPayByBankWireBtn() {
	PayByBankWireBtn.click();	
	}
	
	public String assertPaymentPage() {
	String 	getchosenBankWireText=orderSummaryText.getText();
	return getchosenBankWireText;
	}
	}
