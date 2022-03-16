package com.falabella.testcases;

import org.testng.annotations.Test;
import com.falabella.base.Page;
import com.falabella.pages.actions.HomePage;
import com.falabella.pages.actions.RegisterPage;

public class RegisterTest {
	
	@Test
	public void registerTest() {
		Page.initConfiguration();
		
		HomePage home =  new HomePage();
		home.eraseOffer();

		RegisterPage register = Page.topNav.gotoRegister();
		register.doRegister("Gerardo","Ortega","30.686.957-4","94654645", "gerardo.ortega.pedroza@gmail.com","asdfasdfasA1");
		Page.quitBrowser();
	}

}
