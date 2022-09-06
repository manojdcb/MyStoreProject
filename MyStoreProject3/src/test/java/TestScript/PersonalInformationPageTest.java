package TestScript;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseClass;
import pageClass.HomePage;
import pageClass.LoginPage;
import pageClass.PersonalInformationPage;
import utility.ScreenShot;

public class PersonalInformationPageTest extends BaseClass {
	
	@BeforeMethod
	public void setup() {	
	launchApp();
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
	ScreenShot.takeScreenshot(driver,result.getName());	
	closeapp();	
	}
	
	@Test
	public void verifyPersonalInformationPage() {
	HomePage hm=new HomePage(driver);
	hm.clickOnSignBtn();
	
	LoginPage lp=new LoginPage(driver);
	lp.createAccountEmailAddress();
	lp.clickOncreateAccountBtn();
	
	PersonalInformationPage pi=new PersonalInformationPage(driver);
	pi.clickOnRadioButton();
	pi.enterFirstName();
	pi.enterLastName();
	
	pi.enterPassword();
	pi.selectDob();
	pi.enterCompanyName();
	pi.enterAddressLine1();
	pi.enterAddressLine2();
	pi.enterCityName();
	pi.selectState();
	pi.enterPostalCode();
	pi.selectCountry();
	pi.enterHomePhone();
	pi.enterMobile();
	pi.enterSecondAddress();
	pi.clickOnRegisterBtn();
	String actText=pi.assertPersonalInformationPage();
	Assert.assertEquals(actText, "MY ACCOUNT");
	
	}
	}
