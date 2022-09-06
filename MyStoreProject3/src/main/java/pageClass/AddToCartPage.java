package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class AddToCartPage extends BaseClass {
	
	@FindBy(xpath="//p[@id='add_to_cart']//button")
	WebElement addToCartBtnText;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement checkOutBtn;
	
	@FindBy(xpath="(//h3[@class='page-subheading'])[1]")
	WebElement deliveryAddressText;
	
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCartBtn() {
	addToCartBtnText.click();	
	}
	public void clickOnProceedToCheckOut() {
	checkOutBtn.click();	
	}
	
	public String verifyAddToCartPage() {
	String verifyText=	deliveryAddressText.getText();
	return verifyText;
	}
}
