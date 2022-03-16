package com.falabella.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.falabella.base.Page;
import com.falabella.pages.locators.ConfirmationProductsLocators;

public class ConfirmationProductsPage extends Page {
	
	public ConfirmationProductsLocators confirmationProducts;
	public TopNavigation topNav = new TopNavigation(driver);
	
	
    public ConfirmationProductsPage() {
        this.confirmationProducts = new ConfirmationProductsLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.confirmationProducts);
	}
    
    public void gotoShoppingCar() {
    	confirmationProducts.gotoShoppingCar.click();
    }

}
