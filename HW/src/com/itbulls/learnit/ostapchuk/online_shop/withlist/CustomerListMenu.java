package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import java.util.List;

import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.ApplicationContext;
import com.itbulls.learnit.ostapchuk.online_shop.withlist.DefaultUserManagementService;
import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.Menu;
import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.User;
import com.itbulls.learnit.ostapchuk.online_shop.withlist.UserManagementService;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		List<User> users = userManagementService.getUsers();
		if (users == null || users.size() == 0) {
			System.out.println("UNFORTUNATELY, THERE ARE NO CUSTOMERS.");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***USERS***");
	}

}
