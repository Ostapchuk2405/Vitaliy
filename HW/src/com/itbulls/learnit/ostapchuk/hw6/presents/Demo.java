package com.itbulls.learnit.ostapchuk.hw6.presents;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		Sweet candy = new ChocolateCandy();
		candy.setName("Ritter Sport");
		candy.setSugarWeight(0.53);
		candy.setWeight(0.05);
		
		Cookie cookie = new Oreo();
		cookie.setName("Milk Oreo");
		cookie.setSugarWeight(0.1);
		cookie.setDoughWeight(0.3);
		cookie.setWeight(0.2);
		
		Sweet lollipop = new Lollipop();
		lollipop.setWeight(0.5);
		lollipop.setName("Lollipop");
		lollipop.setSugarWeight(0.2);
		
		Present present = new Present();
		present.addSweet(candy);
		present.addSweet(cookie);
		present.addSweet(lollipop);
		
		Sweet[] filteredSweets = present.filteredSweetsBySugarRange(0, 0.20);
		System.out.println(Arrays.toString(filteredSweets));
		System.out.println("TOTAL WEIGHT OF THE PRESENT: " + present.calculateTotalWeight());
	}

}
