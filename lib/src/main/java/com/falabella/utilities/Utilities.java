package com.falabella.utilities;

import com.falabella.base.Page;

public class Utilities extends Page {
		
	
	public  double castPrice(String priceS) {
		priceS = priceS.replace("$", "");
		priceS = priceS.replace(".", "");
		return Double.parseDouble(priceS);
		
	}
	
	
}
