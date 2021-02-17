package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import java.util.List;

import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.User;

public interface UserManagementService {

	String registerUser(User user);

	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
