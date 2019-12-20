package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.HotelsPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	HotelsPage hotelsPage;

	public HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(10000);
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "My Account","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		Assert.assertEquals(homePage.verifyCorrectUserName(),"Hi, " + prop.getProperty("fullname"));
	}
	
	@Test(priority=3)
	public void verifyHotelsLinkTest(){
		hotelsPage = homePage.clickOnProfileLink();
	}
	
	@AfterMethod
	public void tearDown() {
	
		driver.close();
	}
	
}
