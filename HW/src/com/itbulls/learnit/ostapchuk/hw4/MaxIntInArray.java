package com.itbulls.learnit.ostapchuk.hw4;

import java.util.Scanner;

public class MaxIntInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the numbers");
		String ints = sc.nextLine();
		sc.close();

		int[] intArray = convertArrayStringToInt(ints.split(" "));
		int maxValue = findMaxIntInArray(intArray);

		System.out.println(maxValue);
	}

	private static int findMaxIntInArray(int[] intArray) {
		// TODO Auto-generated method stub
		int max = intArray[0];
		for(int i : intArray ) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}

	private static int[] convertArrayStringToInt(String[] stringArray) {
		// TODO Auto-generated method stub
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		return intArray;
	}
}
