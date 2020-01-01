package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ShoppingCart extends TestBase {
	
	@FindBy(xpath ="//*[@id='layer_cart']//following::*[@class='btn btn-default button button-medium']//following::*[contains(text(),'Proceed to checkout')]")
	WebElement checkout;
	
	// Initializing the Page Objects:
		public ShoppingCart() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyShoppingCartLabel(){
			return driver.getTitle();
		}
		
		public CheckOut CheckoutLink(){
			checkout.click();      
	        return new CheckOut();
		}
		
		
		
}
