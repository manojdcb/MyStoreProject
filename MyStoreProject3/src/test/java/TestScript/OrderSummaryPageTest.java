package TestScript;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.AddressPage;
import pageClass.CatalogPage;
import pageClass.HomePage;
import pageClass.OrderSummaryPage;
import pageClass.PaymentPage;
import pageClass.ShippingCartSummaryPage;
import pageClass.ShippingPage;
import pageClass.SignInPage;
import utility.ScreenShot;

public class OrderSummaryPageTest extends BaseClass {
	
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
	public void verifyOrderSummaryPage() {
	HomePage hm=new HomePage(driver);                                    
	hm.clickOnTshirtMenu();		                                         
								                                                         
	CatalogPage cp=new CatalogPage(driver);                              
	cp.selectTshirt();	                                                 
	cp.OnAddToCartBtn();                                                 
	cp.clickOnProceedToCheckOutBtn();	                                 
							                                                             
	ShippingCartSummaryPage ss=new ShippingCartSummaryPage(driver);      
	ss.clickOnProceedToCheckout();                                       
					                                                                     
	SignInPage sp=new SignInPage(driver);                                
	sp.enterEmailAddress();                                              
	sp.enterPassword();                                                  
	sp.clickOnSignInBtn();                                               	
					
	AddressPage ap=new AddressPage(driver);	
	ap.clickOncheckOutBtn();
			
	ShippingPage shipping=new ShippingPage(driver);
	shipping.clickOnTermsOfServiceCheckBox();
	shipping.clickOnProceedToCheckOutBtn();	
		
	PaymentPage payment=new PaymentPage(driver);
	payment.clickOnPayByBankWireBtn();
	
	
	OrderSummaryPage op=new OrderSummaryPage(driver);
	op.clickOnConfirmationOrderBtn();
	String actText=op.assertOrderSummaryPage();
	Assert.assertEquals(actText, "ORDER CONFIRMATION");
				
		
		
	}

}
