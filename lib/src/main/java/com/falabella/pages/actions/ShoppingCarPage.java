package com.falabella.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.falabella.base.Page;
import com.falabella.pages.locators.ShoppingCarLocators;
import com.falabella.utilities.Utilities;

public class ShoppingCarPage extends Page {
	
	public ShoppingCarLocators shoppingCar;
	public TopNavigation topNav = new TopNavigation(driver);
	
	
    public ShoppingCarPage () {
        this.shoppingCar = new ShoppingCarLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.shoppingCar);
	}
    
    public double checkAmount() {
    	Utilities ut = new Utilities();
    	return ut.castPrice(shoppingCar.amountCost.get(1).getText());

    }

}
