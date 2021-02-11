package com.itbulls.learnit.ostapchuk.online_shop.withoutlist;

public interface Order {

	boolean isCreditCardNumberValid(String userInput);

	void setCreditCardNumber(String userInput);

	void setProducts(Product[] products);

	void setCustomerId(int customerId);
	
	int getCustomerId();
}
