package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class OrderSummaryPage extends BaseClass {
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")	
	WebElement confirmOrderBtn;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	WebElement orderConfirmationText;
	
	public OrderSummaryPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void clickOnConfirmationOrderBtn() {
	confirmOrderBtn.click();
	}
	
	public String assertOrderSummaryPage() {
	String getorderConfirmationText= orderConfirmationText.getText();
	return getorderConfirmationText; 
	}

}
