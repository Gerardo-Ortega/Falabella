package com.falabella.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.falabella.base.Page;
import com.falabella.pages.locators.LoginPageLocators;

public class LoginPage extends Page {
	
	public LoginPageLocators login;
	public TopNavigation topNav = new TopNavigation(driver);
	
	 public LoginPage () {
	   this.login = new LoginPageLocators();
	   AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
	   PageFactory.initElements(factory, this.login);
	}
	 
	 public void doLogin( String email, String password) {
		 login.email.sendKeys(email);
		 login.password.sendKeys(password);
 	     login.submit.click(); 
	 }

}
