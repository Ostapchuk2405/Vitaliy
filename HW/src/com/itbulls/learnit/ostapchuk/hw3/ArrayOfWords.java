package com.itbulls.learnit.ostapchuk.hw3;

import java.util.Scanner;

public class ArrayOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String arrayOfWords = sc.nextLine();
		sc.close();
		
		String[] words = arrayOfWords.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}

	}

}
