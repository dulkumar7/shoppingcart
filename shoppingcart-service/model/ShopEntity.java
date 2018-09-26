package com.nttdata.pcf.dev.shopizer.shoppingcartservice.model;

import java.io.Serializable;

public class ShopEntity extends Entity implements Serializable{

	private static final long serialVersionUID = 1L;
	private String language;
	
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLanguage() {
		return language;
	}


}