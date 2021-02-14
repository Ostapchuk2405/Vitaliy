package com.itbulls.learnit.ostapchuk.hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomElementsArray {
	
	public static final int MULTIPLIER = 2;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arrayLenght = sc.nextInt();
		sc.close();
		
		int[] arr = generateRandomArray(arrayLenght);
		int[] extendedArray = extendArray(arr);
		System.out.println("INITIAL ARRAY:");
		System.out.println(Arrays.toString(arr));
		System.out.println("EXTENDED ARRAY:");
		System.out.println(Arrays.toString(extendedArray));
	}

	private static int[] generateRandomArray(int amountOfElements) {
		
		Random r = new Random();
		int[] generatedArray = new int[amountOfElements];
		for(int i = 0; i < amountOfElements; i++) {
			generatedArray[i] = r.nextInt(100) + 1;
		}
		return generatedArray;
	}
	

	private static int[] extendArray(int[] arr) {
		
		int newArrayLenght = arr.length * 2;
		int[] resultArray = Arrays.copyOf(arr, newArrayLenght);
		for(int i = arr.length; i < newArrayLenght; i++) {
			resultArray[i] = arr[i - arr.length] * MULTIPLIER;
		}
		return resultArray;
	}

}
