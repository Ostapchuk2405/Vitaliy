package com.itbulls.learnit.ostapchuk.hw4;

import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter any text: ");
		String userInput = sc.nextLine();
		sc.close();
		int amountOfAWords = getWordsAmout(userInput);
		System.out.println("Amout of a words " + amountOfAWords);
	}

	private static int getWordsAmout(String text) {
		return text.split("[\\p{P}||s]").length;
	}

}
