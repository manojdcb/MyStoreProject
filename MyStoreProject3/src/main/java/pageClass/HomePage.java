package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signInBtn;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	WebElement tshirtMenu;
	
	
	
	public HomePage(WebDriver driver) {	
	PageFactory.initElements(driver, this);	
	}
	
	public void clickOnSignBtn() {
	signInBtn.click();		
	}
	
	public void clickOnTshirtMenu() {
	tshirtMenu.click();	
	}
	}