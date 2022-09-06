package TestScript;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.HomePage;
import pageClass.LoginPage;
import utility.ScreenShot;

public class LoginPageTest extends BaseClass {
	LoginPage lp;
	HomePage hm;
	
	@BeforeMethod
	public void setup() {
	launchApp();
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) {
	ScreenShot.takeScreenshot(driver,result.getName());	
	closeapp();		
	}
	
	@Test(priority=1)
	public void verifyCreateAccount() {
	hm= new HomePage(driver);
	hm.clickOnSignBtn();		
	lp=new LoginPage(driver);
	lp.createAccountEmailAddress();
	lp.clickOncreateAccountBtn();
	String actText=lp.assertCreateAccount();
	Assert.assertEquals(actText, "CREATE AN ACCOUNT");
	
	}
	
	@Test (priority=2)
	public void verifyLoginPage() {
		
	HomePage hm=new HomePage(driver);
	hm.clickOnSignBtn();
	
	LoginPage lp=new LoginPage(driver);
	lp.enterLoginEmailAddress();
	lp.enterLoginPassword();
	lp.clickOnSignBtnLogin();
	
	String actText=lp.assertLogin();
	Assert.assertEquals(actText, "MY WISHLISTS");
	}
	}
