package pageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.BaseClass;

public class CatalogPage extends BaseClass {
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement tshirtImage;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	WebElement iFrame;

	@FindBy(xpath="//button[@name='Submit']")
	WebElement addToCartBtnText;
	
	@FindBy(xpath="//div[@id='layer_cart']/div/div[1]/h2")
	WebElement productAddedText;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	WebElement proceedToCheckOutBtn;
	
	public CatalogPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	public void selectTshirt() {			
	tshirtImage.click();
	driver.switchTo().frame(iFrame);
		
	}
	
	public void OnAddToCartBtn() {
	addToCartBtnText.click();	
	}
	
	public void clickOnProceedToCheckOutBtn() {
	proceedToCheckOutBtn.click();	
	}
	
	
	public boolean assertSelectTshirt () {	
	boolean availble =addToCartBtnText.isDisplayed();
	return availble;
	}
	
	public String assertAddToCartBtn() {
	String getproductAddedText=productAddedText.getText();
	System.out.println(getproductAddedText);
	return getproductAddedText;
	}
	
	public String assertProceedToCheckOutBtn() {
	String getCurrentUrl=driver.getCurrentUrl();
	return getCurrentUrl;
	}

}
