package com.falabella.rough;

import org.testng.Assert;

import com.falabella.base.Page;
import com.falabella.pages.actions.ConfirmationProductsPage;
import com.falabella.pages.actions.HomePage;
import com.falabella.pages.actions.ProductsPage;
import com.falabella.pages.actions.ShoppingCarPage;


public class ShoppingCarTest {
	
	
	public static void main(String[] args) {
		Page.initConfiguration();
		HomePage home =  new HomePage();
		double price;
		home.eraseOffer();
		home.gotoCards();		
		ProductsPage products = new ProductsPage();
		price = products.addProduct();
		ConfirmationProductsPage confirm = new ConfirmationProductsPage();
		confirm.gotoShoppingCar();
		ShoppingCarPage sh = new ShoppingCarPage();

		Assert.assertEquals(sh.checkAmount(),price);
		
		Page.quitBrowser();
	}

}
