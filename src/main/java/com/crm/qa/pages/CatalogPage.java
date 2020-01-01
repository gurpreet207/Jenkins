package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CatalogPage extends TestBase {

	@FindBy(xpath = "//*[@id='center_column']//following::*[@title='Printed Dress' and @class='product-name']")
	WebElement Label;
	
	//@FindBy(xpath = "//*[@id='add_to_cart']//following::*[@type='submit' and @name='Submit']//following::*[contains(text(),'Add to cart')]")
	@FindBy(xpath = "//*[@id='add_to_cart']//following::*[contains(text(),'Add to cart')]")
	                 
	WebElement Addcart;
	
	// Initializing the Page Objects:
	public CatalogPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyCatalogLabel(){
		return driver.getTitle();
	}
	
	
	public ShoppingCart ShoppingCartLink() throws InterruptedException{
		
		Label.click();
	    Thread.sleep(3000); //Wait for 3 seconds
	    Addcart.click();      
        //Thread.sleep(2000);//Wait for 2 seconds
		return new ShoppingCart();
	}

	
	
	/*
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
	
	public void createNewContact(String title, String ftName, String ltName, String comp){
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp);
		saveBtn.click();
		
	}
	
	*/
	

}
