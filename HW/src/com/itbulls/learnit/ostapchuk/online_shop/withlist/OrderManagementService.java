package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import java.util.List;
import com.itbulls.learnit.ostapchuk.online_shop.withlist.Order;

public interface OrderManagementService {

	void addOrder(Order order);
	List<Order> getOrdersByUserId(int userId);
	List<Order> getOrders();
}
