package hw4;

import java.util.Scanner;

public class EmptyRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Height of rectangle: ");
		int height = sc.nextInt();
		System.out.println("Width of rectangle: ");
		int width = sc.nextInt();
		sc.close();

		drawRectangle(height, width);
	}

	private static void drawRectangle(int height, int width) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				if(j == 0 || j == width - 1 || i == 0 || i == height -1) {
					System.out.println("*");
				}else {
				System.out.println(" ");
			}
		}
			System.out.println();
	}
	}
}