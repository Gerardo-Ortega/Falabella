package com.falabella.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.falabella.base.Page;
import com.falabella.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	public TopNavigationLocators topNavigation;

	
	public TopNavigation(WebDriver driver) {
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
		
		
	}
	
	public LoginPage gotoLogin() {
		Page.rollOver(topNavigation.gretingsSession);
		Page.click(topNavigation.sessionStart);
		return new LoginPage();
		
		
	}
	public RegisterPage gotoRegister() {
		Page.rollOver(topNavigation.gretingsSession);
		Page.click(topNavigation.register);
		return new  RegisterPage();
	}
	
	public void gotoHamburguer() {
		
	}

}
