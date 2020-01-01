package com.crm.qa.pages;

//import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath=".//*[@id='login_form']//following::*[@id='email']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='login_form']//following::*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='header']//following::*[contains(text(),'Sign in')]")
	WebElement Signin;
	
	@FindBy(xpath=".//*[@id='login_form']//following::*[@id='SubmitLogin']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		Signin.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		//    	JavascriptExecutor js = (JavascriptExecutor)driver;
		//    	js.executeScript("arguments[0].click();", loginBtn);
		    	
		    	
		    
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
