package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ShippingPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement termsOfServiceCheckbox;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement proceedToCheckOutBtn;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	WebElement choosePaymentMetodText;
	
	public ShippingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void clickOnTermsOfServiceCheckBox() {
	termsOfServiceCheckbox.click();	
	}
	
	public void clickOnProceedToCheckOutBtn() {
	proceedToCheckOutBtn.click();	
	}
	
	public String assertShippingPage() {
	String getChoosePaymentMethodText=	choosePaymentMetodText.getText();
	return getChoosePaymentMethodText;
	}
}
