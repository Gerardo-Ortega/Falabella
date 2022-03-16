package com.falabella.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsLocators {
	
	@FindBy(css = ".jsx-4001457643.search-results-4-grid.grid-pod")
	public WebElement cardProduct;
	
	@FindBy(css = "#testId-Pod-action-14710478")
	public WebElement addCardButton;
	
	@FindBy(css = ".copy10.primary.medium.jsx-3548557188.normal.line-height-22")
	public WebElement price;
	
	

}
