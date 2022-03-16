package com.falabella.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.falabella.base.Page;
import com.falabella.pages.locators.HomePageLocators;


public class HomePage extends Page {
	
	public HomePageLocators home;
	public TopNavigation topNav = new TopNavigation(driver);
	
	public HomePage () {
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}
	
	public void eraseOffer() {
	      if(driver.findElements( By.cssSelector(".dy-lb-close") ).size() != 0)
			home.xClose.click();
		}

	public void gotoCards() {
		//Page.scroll(home.cardOne);
		home.cardOne.click();
	}
	
	

}
