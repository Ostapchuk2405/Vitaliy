package com.itbulls.learnit.ostapchuk.online_shop.withoutlist;

public interface Cart {
	boolean isEmpty();

	void addProduct(Product productById);

	Product[] getProducts();

	void clear();
}
