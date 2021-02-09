package com.itbulls.learnit.ostapchuk.hw3;

public class FloatAndInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args[0].contains(".") || args[1].contains(".")) {
			double Float1 = Double.parseDouble(args[0]);
			double Float2 = Double.parseDouble(args[1]);
			
			System.out.println(Float1 + Float2);
		} else {
			int Integer1 = Integer.parseInt(args[0]);
			int Integer2 = Integer.parseInt(args[1]);
			
			System.out.println(Integer1 + Integer2);
		}
	}

}
