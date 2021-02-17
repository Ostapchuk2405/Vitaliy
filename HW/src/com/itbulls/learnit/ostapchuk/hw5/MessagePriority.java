package com.itbulls.learnit.ostapchuk.hw5;

import java.util.Scanner;

public class MessagePriority {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("ENTER MESSAGE TO CHECK IT PRIORITY: ");
			String userInput = sc.next();
			sc.close();
			
			if(isValidMessageType(userInput)) {
				MessageType messageType = MessageType.valueOf(userInput.toUpperCase());
				System.out.println(messageType.getPriority());
				break;
			}else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}
		}
	}

	private static boolean isValidMessageType(String userInput) {
		
		return userInput.equalsIgnoreCase("a") || userInput.equalsIgnoreCase("b") || userInput.equalsIgnoreCase("c") || userInput.equalsIgnoreCase("d");
	}

}
