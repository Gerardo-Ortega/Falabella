package com.falabella.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.falabella.base.Page;
import com.falabella.pages.locators.ProductsLocators;
import com.falabella.utilities.Utilities;

public class ProductsPage extends Page {
	
	public ProductsLocators products;
	public TopNavigation topNav = new TopNavigation(driver);
	
	
    public ProductsPage() {
        this.products = new ProductsLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.products);
	}
    
    public double addProduct() {
    	String precio;
    	Utilities ut = new Utilities();
    	Page.scroll(products.cardProduct);
    	Page.rollOver(products.cardProduct);
    	precio = products.price.getText();
    	products.addCardButton.click();
    	return ut.castPrice(precio);

    }

}
