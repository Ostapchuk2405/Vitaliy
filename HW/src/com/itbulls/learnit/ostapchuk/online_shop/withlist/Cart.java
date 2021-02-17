package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import java.util.List;

import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.Product;

public interface Cart {
	
	boolean isEmpty();
	void addProduct(Product productById);
	List<Product> getProducts();
	void clear();

}
