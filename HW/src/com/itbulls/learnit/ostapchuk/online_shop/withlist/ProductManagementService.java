package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import java.util.List;

import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.Product;

public interface ProductManagementService {

	List<Product> getProducts();
	Product getProductById(int productIdToAddToCart);
	
}
