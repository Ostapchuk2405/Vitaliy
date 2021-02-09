package com.itbulls.learnit.ostapchuk.hw2;

import java.util.Formatter;
import java.util.Scanner;

public class Triangle {

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
		sc.close();
		
		p = (A + B + C) / 2;
		S = Math.sqrt(p * (p - A) * (p - B) * (p - C));
		
		
		Formatter f = new Formatter();
		f.format("%.2f", S);
		System.out.println("Площадь треугольника равна= " + f);
		f.close();
	}

	}