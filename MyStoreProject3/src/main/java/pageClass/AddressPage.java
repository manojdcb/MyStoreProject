package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class AddressPage extends BaseClass {
	
	@FindBy(xpath="//button[@name='processAddress']")	
	WebElement proceedToCheckOutBtn;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	WebElement shippingText;

	public AddressPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void clickOncheckOutBtn() {
	proceedToCheckOutBtn.click();	
	}
	
	public String assertAddressPage() {
	String getshippingText=	shippingText.getText();
	return getshippingText;
	}
	
}
