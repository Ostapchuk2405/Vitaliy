package com.itbulls.learnit.ostapchuk.online_shop.withoutlist;

public interface UserManagementService {
	
String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);


}
