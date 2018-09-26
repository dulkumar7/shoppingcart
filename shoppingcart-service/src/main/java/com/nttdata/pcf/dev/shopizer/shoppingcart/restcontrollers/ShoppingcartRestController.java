package com.nttdata.pcf.dev.shopizer.shoppingcart.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nttdata.pcf.dev.shopizer.shoppingcartservice.entties.ShoppingCart;
import com.nttdata.pcf.dev.shopizer.shoppingcartservice.service.ShopCartService;

public class ShoppingcartRestController {
	
	
	@Autowired
	private ShopCartService shopCartService;
	
	@RequestMapping(value="/shoppingcart", method=RequestMethod.GET)
	public ShoppingCart get() {
		return shopCartService.get();
	}

	
}