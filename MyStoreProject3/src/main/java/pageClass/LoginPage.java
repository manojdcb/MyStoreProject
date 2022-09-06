package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailAddressTextBox;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createAnAccountBtn;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailAddressforLogin;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement enterPasword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement signInBtn;
	
	@FindBy(xpath="//li[@class='lnk_wishlist']//a")
	WebElement myWishListText;
	
	@FindBy(xpath="(//h3[@class='page-subheading'])[1]")
	WebElement createAnAccountText;
	
	public LoginPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);	
	}
	
	public void createAccountEmailAddress() {	
	String usernameForlogin=prop.getProperty("username");
	emailAddressTextBox.sendKeys(usernameForlogin);
	}
	
	public void clickOncreateAccountBtn() {
	createAnAccountBtn.click();
	}
	
	public void enterLoginEmailAddress() {
	String usernameForlogin=prop.getProperty("username");
	emailAddressforLogin.sendKeys(usernameForlogin);

	}
	
	public void enterLoginPassword() {
	String pass=prop.getProperty("password");	
	enterPasword.sendKeys(pass);
		
	}
	
	public void clickOnSignBtnLogin() {
	signInBtn.click();
	}
	
	public String assertCreateAccount() {
	String getyourPersonalInformationText=createAnAccountText.getText();
	return getyourPersonalInformationText; 
		
	}
	
	public String assertLogin() {
	String getmyWishListText= myWishListText.getText();
	return getmyWishListText;
	}

}
