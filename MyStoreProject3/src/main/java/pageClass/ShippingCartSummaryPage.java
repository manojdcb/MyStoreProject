package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ShippingCartSummaryPage extends BaseClass {
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	WebElement proceedToCheckOutBtn;
	
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signBtn;
	
	public ShippingCartSummaryPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void clickOnProceedToCheckout() {
	proceedToCheckOutBtn.click();	
	}

	public boolean assertShippingCartSummaryPage() {
	boolean checkSignInBtn=signBtn.isDisplayed();
	return checkSignInBtn;
	}
	}
