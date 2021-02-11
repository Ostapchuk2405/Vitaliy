package com.itbulls.learnit.ostapchuk.online_shop.withoutlist;

public interface ProductManagementService {
	
	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
