package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.Product;
import com.itbulls.learnit.ostapchuk.online_shop.withlist.Cart;

public class DefaultCart implements Cart {

	private List<Product> products;
	{
		products = new ArrayList<Product>();
	}
	@Override
	public boolean isEmpty() {
		return products.isEmpty();
	}
	
	@Override
	public void addProduct(Product product) {
		if(product == null) {
			return;
		}
		products.add(product);
	}
	
	@Override
	public List<Product> getProducts() {
		return this.products;
		
	}
	@Override
	public void clear() {
		products.clear();
		
	}
	
	

}
