package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class PersonalInformationPage extends BaseClass {
	
	@FindBy(xpath="//div[@id='uniform-id_gender1']")
	WebElement radioButton;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement firstNameTextbox;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement lastNameTextbox;
	

	@FindBy(xpath="//input[@id='passwd']")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement date;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement month;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement year;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement addressFirstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement addressLastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement companyName;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement AddressLine1;
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement AddressLine2;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement cityName;
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement postalCode;
	
	@FindBy(xpath="//select[@id='id_country']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement homePhone;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='alias']")
	WebElement secondAddress;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	WebElement RegisterBtn;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	WebElement myAccountText;
	
	public PersonalInformationPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);	
	}
	
	public void clickOnRadioButton() {
	radioButton.click();
	}
	public void enterFirstName() {
	firstNameTextbox.sendKeys("Ram");	
	}
	
	public void enterLastName() {
	lastNameTextbox.sendKeys("Patil");	
	}
	
	public void enterPassword() {
	passwordTextbox.sendKeys("12345");	
	}
	
	public void selectDob() {
	Select dropdownDate=new Select(date);
	dropdownDate.selectByIndex(10);
	
	Select dropdownMonth=new Select(month);
	dropdownMonth.selectByIndex(5);
	
	Select dropdownYear= new Select(year);
	dropdownYear.selectByIndex(25);
	}
	
	public void enterCompanyName() {
	companyName.sendKeys("ABC");	
	}
	
	public void enterAddressLine1() {
	AddressLine1.sendKeys("Line1");	
	}
	public void enterAddressLine2() {
	AddressLine2.sendKeys("Line2");	
	}
	
	public void enterCityName() {
	cityName.sendKeys("NJ");	
	}
	
	public void selectState() {
	Select st=new Select(state);
	st.selectByIndex(10);
	}
	
	public void enterPostalCode() {
	postalCode.sendKeys("32165");	
	}
	
	public void selectCountry() {
	Select dropdownCountry= new Select(country);
	dropdownCountry.selectByIndex(1);
	}
	
	public void enterHomePhone() {
	homePhone.sendKeys("2109856324");	
	}
	
	public void enterMobile() {
	mobile.sendKeys("2108956321");	
	}
	
	public void enterSecondAddress() {
	secondAddress.clear();	
	secondAddress.sendKeys("AK");	
	}
	
	public void clickOnRegisterBtn() {
	RegisterBtn.click();
	}
	
	public String assertPersonalInformationPage() {
	String verifyText=myAccountText.getText();
	System.out.println(verifyText);
	return verifyText;
	}

}
