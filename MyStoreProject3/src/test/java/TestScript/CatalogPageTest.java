package TestScript;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.CatalogPage;
import pageClass.HomePage;
import utility.ScreenShot;

public class CatalogPageTest extends BaseClass {

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
	public void verifyClickOnTshirt() {
	HomePage hm=new HomePage(driver);
	hm.clickOnTshirtMenu();
	
	CatalogPage cp=new CatalogPage(driver);
	cp.selectTshirt();
	
	
	boolean value=cp.assertSelectTshirt();
	Assert.assertEquals(value, true);
	}
	
	
	@Test(priority=2)
	public void verifyClickOnAddToCartBtn() {
	HomePage hm=new HomePage(driver);
	hm.clickOnTshirtMenu();
		
	CatalogPage cp=new CatalogPage(driver);
	cp.selectTshirt();
	
	cp.OnAddToCartBtn();
	String actText=cp.assertAddToCartBtn();
	Assert.assertEquals(actText, "Product successfully added to your shopping cart");
	}
	
	@Test(priority=3)
	public void verifyProceedToCheckOutBtn() {
	HomePage hm=new HomePage(driver);
	hm.clickOnTshirtMenu();	
	
	CatalogPage cp=new CatalogPage(driver);
	cp.selectTshirt();	
	cp.OnAddToCartBtn();
	cp.clickOnProceedToCheckOutBtn();
	
	String actUrl=cp.assertProceedToCheckOutBtn();
	Assert.assertEquals(actUrl, "http://automationpractice.com/index.php?controller=order");
	}
	}
