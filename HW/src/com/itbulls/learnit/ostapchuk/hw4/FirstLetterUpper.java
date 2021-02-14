package com.itbulls.learnit.ostapchuk.hw4;

import java.util.Scanner;

public class FirstLetterUpper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY TEXT:");
		String userInput = sc.nextLine();
		sc.close();
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	private static String firstCharToTitleCase(String string) {
		
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		for(int i = 0; i < chars.length; i++) {
			if(!found && Character.isLetter(chars[i])) {
			found = true;
		} else if(Character.isWhitespace(chars[i])) {
			found = false;
					}
	}
		return String.valueOf(chars);
	}

}
