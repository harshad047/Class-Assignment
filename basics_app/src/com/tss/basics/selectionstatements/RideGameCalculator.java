package com.tss.basics.selectionstatements;

import java.util.Scanner;

public class RideGameCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in cm: ");
		float height = sc.nextFloat();

		if (height > 120) {
			System.out.println("you can ride");
			System.out.println("Enter your Age");
			int age = sc.nextInt();
			System.out.println("Enter if you want photos or not(yes or not): ");
			String photo = sc.next();
			if (photo.equalsIgnoreCase("yes")) {
				cost = 3;
			}
			if (age < 12) {
				cost = cost + 5;
			} else if (age >= 12 && age < 18) {
				cost = cost + 7;
			} else if (age >= 18 && age < 45) {
				cost = cost + 12;
			} else if (age >= 45 && age < 55) {
				cost = cost + 0;
			} else {
				cost = cost + 12;
			}
		} else {
			System.out.println("you can't ride");
		}
		System.out.println("Cost: " + cost);

	}

}
