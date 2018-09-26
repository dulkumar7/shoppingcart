package com.nttdata.pcf.dev.shopizer.shoppingcartservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.nttdata.pcf.dev.shopizer.shoppingcartservice.entties.ShoppingCart;
import com.nttdata.pcf.dev.shopizer.shoppingcartservice.repository.ShoppingCartRepository;

@Service
@ComponentScan
public class ShopCartService {
	
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	
	public ShoppingCart get() {
		return shoppingCartRepository.findOne((long)1);
	}
	

}


