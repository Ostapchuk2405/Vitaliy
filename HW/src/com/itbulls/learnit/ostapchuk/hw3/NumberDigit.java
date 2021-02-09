package com.itbulls.learnit.ostapchuk.hw3;

import java.util.Scanner;

public class NumberDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arrayDigits = sc.next();
		sc.close();
		
		for(char digit:arrayDigits.toCharArray()) {
			System.out.println(digit);
		}
	}

}
