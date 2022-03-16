package com.falabella.testcases;

import org.testng.annotations.Test;
import com.falabella.base.Page;
import com.falabella.pages.actions.HomePage;
import com.falabella.pages.actions.LoginPage;

public class LoginTest {
	
	
	@Test
	public void loginTest() {
       Page.initConfiguration();
		HomePage home =  new HomePage();
		home.eraseOffer();
		
		LoginPage login = Page.topNav.gotoLogin();
		login.doLogin("gerardo.ortega.pedroza@gmail.com","asdfasdfasA1");
		
		Page.quitBrowser();
	}

}
