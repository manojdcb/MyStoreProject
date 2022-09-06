package TestScript;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.CatalogPage;
import pageClass.HomePage;
import pageClass.ShippingCartSummaryPage;
import utility.ScreenShot;

public class ShippingCartSummaryPageTest extends BaseClass {
	
	
	@BeforeMethod
	public void setup() {
	launchApp ();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
	ScreenShot.takeScreenshot(driver,result.getName());	
	closeapp();	
	}
	
	@Test
	public void verifyProceedToCheckOut() {
	HomePage hm=new HomePage(driver);
	hm.clickOnTshirtMenu();	
		
	CatalogPage cp=new CatalogPage(driver);
	cp.selectTshirt();	
	cp.OnAddToCartBtn();
	cp.clickOnProceedToCheckOutBtn();	
		
	ShippingCartSummaryPage ss=new ShippingCartSummaryPage(driver);
	ss.clickOnProceedToCheckout();
	boolean checksignInBtn=ss.assertShippingCartSummaryPage();
	Assert.assertEquals(checksignInBtn,true );
	}
	}
