package com.tss.structural.facade.test;

import java.util.Scanner;

import com.tss.structural.facade.model.HotelReception;

public class HotelTest {

	public static void main(String[] args) {
		HotelReception reception = new HotelReception();
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("\n==== Welcome to Hotel Reception ====");
			System.out.println("1. Get Indian Menu");
			System.out.println("2. Get Italian Menu");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				reception.getIndianMenu();
				break;
			case 2:
				reception.getItalianMenu();
				break;
			case 3:
				System.out.println("Thank you for visiting!");
				loop = false;
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}

}
