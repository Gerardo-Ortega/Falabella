package com.falabella.pages.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	@FindBy(css = ".jsx-2017513839.jsx-3056293392")
	public WebElement name;
	
	@FindBy(css = "#testId-Input-lastName")
	public WebElement lastName;
	
	@FindBy(css = "#testId-Input-document")
	public WebElement rut;
	
	@FindBy(css = "#testId-Input-phoneNumber")
	public WebElement phoneNumber;
	
	@FindBy(css = "#testId-Input-email")
	public WebElement email;
	
	@FindBy(css = "#testId-Input-password")
	public WebElement password;
	
	@FindBy(css = "#testId-consent-consentTemplateRegistroTyC_FAL_CL-input")
	public WebElement terminos;
	
	@FindBy(css = "#testId-consent-consentTemplateRegistroPdP_FAL_CL-input")
	public WebElement conditions;
	
	@FindBy(css = "#testId-Button-submit")
	public WebElement registerButton;
	
	
	
	
	
	
	
	

}
