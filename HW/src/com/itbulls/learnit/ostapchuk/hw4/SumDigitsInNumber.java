package com.itbulls.learnit.ostapchuk.hw4;

import java.util.Scanner;

public class SumDigitsInNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER:");
		int number = sc.nextInt();
		sc.close();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
		
	}

	private static int sumDigitsInNumber(int number) {
		
		int result = 0;
		while(number != 0) {
			result += number % 10;
			number /= 10;
		}
		return Math.abs(result);
	}

}
