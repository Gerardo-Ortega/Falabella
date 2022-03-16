package com.falabella.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.falabella.pages.actions.HomePage;

public class LoginPageLocators extends HomePage {
	
	//Elementos para iniciar sesion
	@FindBy(css = "#testId-cc-login-form-email-input")
	public WebElement email;
	@FindBy(css = "#testId-cc-login-form-password-input")
	public WebElement password;
	@FindBy(css = "#testId-cc-login-form-submit")
	public WebElement submit;

}
