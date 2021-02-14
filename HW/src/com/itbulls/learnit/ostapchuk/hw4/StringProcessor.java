package com.itbulls.learnit.ostapchuk.hw4;

public class StringProcessor {
	
	public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";

	public static void main(String[] args) {
		
		System.out.println("CONVERT 1:");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("CONVERT 2:");
		System.out.println(convert2(INPUT_DATA));

	}

	private static String convert1(String inputData) {
		
		String result = "";
		String[] lines = inputData.split(System.lineSeparator());
		for(int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			result += wordsInLine[0] + "==>" + wordsInLine[2] + System.lineSeparator();
		}
		return result;
	}

	private static String convert2(String inputData) {
		
		String result = new String();
		String[] lines = inputData.split(System.lineSeparator());
		for(int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			result += wordsInLine[1] + " (email: " + wordsInLine[2] + ")" + System.lineSeparator();
		}
		return result;
	}

}
