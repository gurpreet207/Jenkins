package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase_N;
import com.crm.qa.pages.HomePage_N;
import com.crm.qa.pages.LoginPage_N;

public class LoginPageTest_N extends TestBase_N{
	LoginPage_N loginPage;
	HomePage_N homePage;
	
	public LoginPageTest_N(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage_N();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	
	/*@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}*/
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
