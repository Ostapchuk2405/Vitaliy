package com.itbulls.LearnIT.Ostapchuk.operations;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, B, C, p, S;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of the side A:");
		A = sc.nextDouble();
		
		System.out.println("Enter length of the side B:");
		B = sc.nextDouble();
		
		System.out.println("Enter length of the side C");
		C = sc.nextDouble();
		
		p = (A + B + C) / 2;
		S = Math.sqrt(p * (p - A) * (p - B) * (p - C));
		
		System.out.println(S);
		sc.close();
	}

}
