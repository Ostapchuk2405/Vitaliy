package com.itbulls.learnit.ostapchuk.online_shop.withoutlist;

public interface Product {

	int getId();

	String getProductName();
	
	String getCategoryName();
	
	double getPrice();
	
	void setPrice(double price);

}
