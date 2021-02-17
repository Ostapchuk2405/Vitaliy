package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import java.util.List;

import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.ApplicationContext;
import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.DefaultOrderManagementService;
import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.MainMenu;
import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.Menu;
import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.OrderManagementService;

public class MyOrdersMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;
	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		if (context.getLoggedInUser() == null) {
			System.out.println("PLEASE, LOG IN OR CREATE NEW ACCOUNT TO SEE LIST OF YOUR ORDERS");
			new MainMenu().start();
			return;
		}
		new MainMenu().start();
	}

	private void printUserOrdersToConsole() {
		List<Order> loggedInUserOrders = orderManagementService
				.getOrdersByUserId(context.getLoggedInUser().getId());

		if (loggedInUserOrders == null || loggedInUserOrders.size() == 0) {
			System.out.println(
					"Unfortunately, you don’t have any orders yet. "
					+ "Navigate back to main menu to place a new order");
		} else {
			for (Order order : loggedInUserOrders) {
				System.out.println(order);
			}
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***MY ORDERS***");

	}

}
