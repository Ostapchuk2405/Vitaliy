package com.itbulls.learnit.ostapchuk.hw4;

import java.util.Scanner;

public class ConvertDecimalToRoman {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		mainLoop: while(true) {
			System.out.print("Please, select mode. If you want to convert Roman "
					+ "numbers to decimal - type 'R2D' and press enter."
					+ System.lineSeparator()
					+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

			String mode = sc.next();
			if(mode.equalsIgnoreCase("R2D")) {
				while(true) {
					System.out.println("ENTER ROMAN NUMBER:");
					String romanNumber = sc.next();
					if(isRomanNumberValid(romanNumber)) {
						System.out.println(roman2Decimal(romanNumber));
						break mainLoop;
					}else {
						System.out.println("YOU ENTERED INVALID ROMAN NUMBER. " + 
					"PLEASE, BE CAREFULL!");
						continue;
					}
				}
			}else if (mode.equalsIgnoreCase("D2R")) {
				while(true) {
					System.out.println("ENTER DECIMAL NUMBER:");
					int decimalNumber = sc.nextInt();
					if(isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						break mainLoop;
					}else {
						System.out.println("ENTER POSITIVE NUMBER FROM 1 TO 100");
						continue;
					}
				}
			}
		}
		System.out.println("ENTER R2D OR D2R");
		sc.close();
	}



	private static String decimal2Roman(int number) {
		
		String[] a = new String[] {"I","IV","V","IX","X","XL","L","XC","C"};
		int[] b = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100};
		StringBuilder s = new StringBuilder();
		for(int i = a.length - 1; i >= 0; i--) {
			while(number >= b[i]) {
				s.append(a[i]);
				number -= b[i];
			}
		}
		return s.toString();
	}



	private static int roman2Decimal(String romanNumber) {
		
		String romanNumeral = romanNumber.toUpperCase();
		int decimal = 0;
		int lastNumber = 0;
		
		for(int x = romanNumeral.length() - 1; x >= 0; x--) {
			char convertToDecimal = romanNumeral.charAt(x);
			
			switch(convertToDecimal) {
			case 'C':
				decimal = processDecimal(100, lastNumber, decimal);
				lastNumber = 100;
				break;
			case 'L':
				decimal = processDecimal(50, lastNumber, decimal);
				lastNumber = 50;
				break;
			case 'X':
				decimal = processDecimal(10, lastNumber, decimal);
				lastNumber = 10;
				break;
			case 'V':
				decimal = processDecimal(5, lastNumber, decimal);
				lastNumber = 5;
				break;
			case 'I':
				decimal = processDecimal(1, lastNumber, decimal);
				lastNumber = 1;
				break;
			}
		}
		return decimal;
	}

	private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
		
		if(lastNumber > decimal) {
		return lastDecimal - decimal;
	}else {
		return lastDecimal + decimal;
	}
	}


	private static boolean isDecimalNumberValid(int decimalNumber) {
		
		return decimalNumber > 0 && decimalNumber <= 100;
	}

	private static boolean isRomanNumberValid(String romanNumber) {
		
		return romanNumber.matches("^(?i)M{0,3}(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
	}

}
