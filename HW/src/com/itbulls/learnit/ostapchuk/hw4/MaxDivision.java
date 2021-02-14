package com.itbulls.learnit.ostapchuk.hw4;

import java.util.Scanner;

public class MaxDivision {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Two arguments separeted by space:");
		String userInput = sc.nextLine();
		sc.close();
		String[] inputArgumentsArray = userInput.split(" ");
		
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);
		
		System.out.println(gcdRecursive(number1, number2));
		

	}

	private static int gcdRecursive(int number1, int number2) {
		
		if(number2 == 0) {
			return Math.abs(number1);
		}else {
			return gcdRecursive(number2, number1 % number2);
		}
}
}
