package com.falabella.pages.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy(xpath = "div[@class='MarketplaceHamburgerBtn-module_icon__YC2PL ']")
	public WebElement menuHamburger;
	
	
	@FindBy(css =".Popover-module_popover-container__3qpkj.Popover-module_bottom-caret-notlogin__19OPO")
	public WebElement gretingsSession;
	
	@FindBy(css ="#testId-loggedout-item-0")
	public WebElement sessionStart;

	@FindBy(css ="#testId-loggedout-item-1")
	public WebElement register;
	
}
