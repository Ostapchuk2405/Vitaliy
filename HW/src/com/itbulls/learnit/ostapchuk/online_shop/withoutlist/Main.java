package com.itbulls.learnit.ostapchuk.online_shop.withoutlist;

public class Main {
	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
}
