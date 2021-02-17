package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import java.util.List;

import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.Product;

public interface Order {
	
	boolean isEmptyCardNumberValid(String userInput);
	void setCreditCardNumber(String userInput);
	void setProducts(List<Product> products);
	void setCustomerId(int customerId);
	int getCustomerId();

}
