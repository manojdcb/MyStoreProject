package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SignInPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailAddressTextBox;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement SignInBtn;
	
	@FindBy(xpath="(//h3[@class='page-subheading'])[2]")
	WebElement addressesText;

	public SignInPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
		
	}
	
	public void enterEmailAddress() {
	String usernameForLogin= prop.getProperty("username");	
	emailAddressTextBox.sendKeys(usernameForLogin);		
	}
	
	public void enterPassword() {
	String pass= prop.getProperty("password");	
	passwordTextBox.sendKeys(pass);	
	}
	
	public void clickOnSignInBtn() {
	SignInBtn.click();	
	}
	
	public String assertSignInPage() {
	String getaddressText=	addressesText.getText();
	return getaddressText;
	}
}
