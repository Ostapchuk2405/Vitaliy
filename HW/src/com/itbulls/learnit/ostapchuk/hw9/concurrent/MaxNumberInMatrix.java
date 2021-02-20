package com.itbulls.learnit.ostapchuk.hw9.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MaxNumberInMatrix {

	private static final int COLUMNS = 100;
	private static final int ROWS = 4;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		int[][] matrix = SearchEngine.createRandomMatrix(ROWS, COLUMNS);

		SearchEngine se = new SearchEngine(matrix);

		System.out.println("=======  Demo of MultiThreading Search ========");
		System.out.println("MAX ELEMENT IN MATRIX = " + se.getMaxElementInMatrixMultiThreading());
		System.out.println("TIME OF MULTITHREADING SEARCH = " + se.getTimeOfMultiThreadingSearch());
		System.out.println();
		System.out.println("======= Demo of SingleThreading Search ========");
		System.out.println("MAX ELEMENT IN MATRIX = " + se.getMaxElementInMatrixSingleThreading());
		System.out.println("TIME OF SINGLETHREADING SEARCH = " + se.getTimeOfSingleThreadingSearch());
		System.out.println("\nPrinting the futureList: ");
		for (Future<Integer> future : se.getFutureList()) {
			System.out.println(future.get());
		}
	}

}
