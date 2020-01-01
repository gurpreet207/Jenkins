package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
    
	@FindBy(xpath = "//*[@id='header']//following::*[contains(text(),'GURPREET SINGH CHAWLA')]")
	//@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//*[@id='block_top_menu']//following::*[@title='Dresses'][2]")
	WebElement Dresses;
	
	@FindBy(xpath = "//*[@id='block_top_menu']//following::*[@title='Casual Dresses'][2]")
	WebElement Casualdresses;
	
    /* 
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
    */ 

	//  Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	} 
	
	
	public String verifyCorrectUserName() {
		//Thread.sleep(10000);
		return userNameLabel.getText();
	}
	
	public CatalogPage clickOnDressLink() throws InterruptedException{
		act.moveToElement(Dresses).build().perform();//Hover mouse
		Thread.sleep(3000); //display subelements of above element for 3 seconds after mouse hover
		act.moveToElement(Casualdresses).click().build().perform();//Hover mouse
		Thread.sleep(3000);
		return new CatalogPage();
	}
	
	/*
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}
	
	*/	
	
	
}
