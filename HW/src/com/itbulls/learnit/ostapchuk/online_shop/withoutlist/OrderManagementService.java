package com.itbulls.learnit.ostapchuk.online_shop.withoutlist;

public interface OrderManagementService {
	
	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();


}
