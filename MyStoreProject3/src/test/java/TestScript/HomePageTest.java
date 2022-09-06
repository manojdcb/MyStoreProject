package TestScript;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.HomePage;
import utility.ScreenShot;

public class HomePageTest extends BaseClass {
	HomePage hm;
	
	@BeforeMethod
	public void setup() {
	launchApp ();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
	ScreenShot.takeScreenshot(driver,result.getName());	
	closeapp();	
	}
	
	@Test(priority=1)
	public void verifyClickOnSignBtn() {
	hm=new HomePage(driver);
	hm.clickOnSignBtn();
	String actText=driver.getTitle();
	Assert.assertEquals(actText, "Login - My Store");	
	}
	
	@Test(priority=2)
	public void verifyClickOnTshirtMenu() {
	hm=new HomePage(driver);
	hm.clickOnTshirtMenu();
	String actText=driver.getTitle();
	Assert.assertEquals(actText, "T-shirts - My Store");
	}
	

}
