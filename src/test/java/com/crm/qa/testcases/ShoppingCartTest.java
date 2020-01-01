package com.crm.qa.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CatalogPage;
import com.crm.qa.pages.CheckOut;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.ShoppingCart;
import com.crm.qa.util.TestUtil;

public class ShoppingCartTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CatalogPage catalogPage;
	ShoppingCart shoppingcartpage;
	CheckOut checkout;
	
	public ShoppingCartTest(){
		super();
		
}

	@BeforeMethod
	public void setUp() throws InterruptedException, MalformedURLException {
		
		initialization();
		testUtil = new TestUtil();
		catalogPage = new CatalogPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//testUtil.switchToFrame();
		catalogPage = homePage.clickOnDressLink();
		shoppingcartpage= catalogPage.ShoppingCartLink();
	}
	
	@Test(priority=1)
	public void verifyShoppingcartLabel(){
		Assert.assertEquals(shoppingcartpage.verifyShoppingCartLabel(),"Printed Dress - My Store", "Catalog page title not matched");
		
	}
	
	@Test(priority=2)
	public void verifyShoppingcartPageTest() throws InterruptedException{
		checkout = shoppingcartpage.CheckoutLink();
	}

		
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	

}
