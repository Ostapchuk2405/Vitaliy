package com.itbulls.learnit.ostapchuk.hw3;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 4;
		
		for (int i = 1; i < height + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		for (int i = height - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
