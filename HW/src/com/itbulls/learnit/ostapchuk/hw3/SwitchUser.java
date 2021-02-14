package com.itbulls.learnit.ostapchuk.hw3;

import java.util.Scanner;

public class SwitchUser {

	public static void main(String[] args) {
		System.out.println(
				"1. Login \n" + "2. Sign up \n" + "3. Terminate program \n" + "4. Main menu \n" + "5. About App\n");

		System.out.println("Make your choice");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.close();

		switch (choice) {
		case (1):
			System.out.println("Please, enter your username");
			break;
		case (2):
			System.out.println("Welcome!");
			break;

		case (3):
			System.out.println("Thank you! Good bye!");
			break;
		case (4):
			System.out.println("Main menu");
			break;
		case (5):
			System.out.println("This app is created by me with support of\n" + " ®IT-Bulls.com");
			break;
		default:
			System.out.println(
					"Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");
		}
	}
}
