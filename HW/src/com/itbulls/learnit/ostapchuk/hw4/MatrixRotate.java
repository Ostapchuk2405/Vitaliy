package com.itbulls.learnit.ostapchuk.hw4;

import java.util.Scanner;

public class MatrixRotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of a matrix:");
		int size = sc.nextInt();
		double[][] matrix = generateMatrix(size);
		System.out.println("Base matrix:");
		printMatrixToConsole(matrix);
		System.out.println("To rotate:" + System.lineSeparator() + "90 - press 1" + System.lineSeparator()
				+ "180 - press 2" + System.lineSeparator() + "270 - press 3");
		int mode = sc.nextInt();
		sc.close();
		

		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}
	}

	private static boolean rotateMatrix(double[][] matrix, int mode) {
		switch (mode) {
		case 1:
			rotate90(matrix);
			break;
		case 2:
			rotate180(matrix);
			break;
		case 3:
			rotate270(matrix);
			break;
		default:
			System.out.println("Write carefull. Try again");
			return false;
		}
		return true;
	}

	private static void rotate270(double[][] matrix) {
		transposeMatrix(matrix);
		horizontalReflection(matrix);
	}

	private static void rotate180(double[][] matrix) {
		verticalReflection(matrix);
		horizontalReflection(matrix);
	}

	private static void horizontalReflection(double[][] matrix) {
		double temp;
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - 1 - i][j];
				matrix[matrix.length - 1 - i][j] = temp;
			}
		}
	}

	private static void rotate90(double[][] matrix) {
		transposeMatrix(matrix);
		verticalReflection(matrix);
	}

	
		private static void verticalReflection(double[][] matrix) {
			double temp;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length / 2; j++) {
					temp = matrix[i][j];
					matrix[i][j] = matrix[i][matrix.length - 1 - j];
					matrix[i][matrix.length - 1 - j] = temp;
				}
			}
		}
	

	private static void transposeMatrix(double[][] matrix) {
		double temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;

			}
		}
	}

	private static void printMatrixToConsole(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Double.valueOf(Integer.toString(i) + Integer.toString(j));
			}
		}
		return matrix;
	}

}
