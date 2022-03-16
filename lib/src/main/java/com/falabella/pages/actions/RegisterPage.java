package com.falabella.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.falabella.base.Page;
import com.falabella.pages.locators.RegisterPageLocators;

public class RegisterPage extends Page {
	
	public RegisterPageLocators register;
	public TopNavigation topNav = new TopNavigation(driver);
	
	
    public RegisterPage () {
        this.register = new RegisterPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.register);
	}
    
    public void doRegister(String name, String lastName, String rut,String phoneNumber, String email, String password) {
    	try {

    	    register.name.sendKeys(name);
    	    register.lastName.sendKeys(lastName);
        	register.rut.sendKeys(rut);
        	register.phoneNumber.sendKeys(phoneNumber);
        	Page.scroll(register.registerButton);
        	register.password.sendKeys(password);
        	register.conditions.click();
        	register.terminos.click();
        	register.conditions.click();
            register.email.sendKeys(email);

        	register.registerButton.click();
    	}
    	catch(org.openqa.selenium.StaleElementReferenceException ex)
    	{

        	register.registerButton.click();
    	}
    	
    }

}
