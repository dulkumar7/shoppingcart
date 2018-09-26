package com.nttdata.pcf.dev.shopizer.shoppingcart.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.pcf.dev.shopizer.shoppingcartservice.entties.ShoppingCart;
import com.nttdata.pcf.dev.shopizer.shoppingcartservice.service.ShopCartService;


@RestController
public class ShoppingcartRestController {
	
	
	@Autowired
	private ShopCartService shopCartService;
	
	@GetMapping("/shoppingcart")
	public ShoppingCart get() {
		return shopCartService.get();
	}

	
}