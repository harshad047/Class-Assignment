package com.tss.test;

import java.util.Scanner;
import com.tss.model.ElectricityBill;

public class ElectricityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many Apartment You Want: ");
		int numberOfApartment = scanner.nextInt();
		scanner.nextLine();

		ElectricityBill[] Electricity = new ElectricityBill[numberOfApartment];

		for (int i = 0; i < Electricity.length; i++) {
			getInfo(scanner, Electricity, i);
		}
		int appartmentNumber;
		boolean loop = true;
		while (loop) {
			System.out.println("\n====== Menu ======");
			System.out.println("1. Display Bill");
			System.out.println("2. Government");
			System.out.println("3. Display Current Rate");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Appartment Number: ");
				appartmentNumber = scanner.nextInt();
				ElectricityBill electricity = findAppartmentId(Electricity, appartmentNumber);

				if (electricity != null) {
					electricity.display();
				} else {
					System.out.println("Appartment is Not Registered");
				}
				break;

			case 2:
				System.out.println("Enter New Amount That you want to use as cost per unit: ");
				double costPerUnit = scanner.nextDouble();

				ElectricityBill.setCostPerUnit(costPerUnit);
				break;

			case 3:
				System.out.println("Current Rate Per Unit is: " + ElectricityBill.getCostPerUnit());
				break;
			case 4:
				System.out.println("Exiting. Thank you!");
				loop = false;
				break;

			}
		}
	}

	private static void getInfo(Scanner scanner, ElectricityBill[] electricity, int i) {
		// TODO Auto-generated method stub
		System.out.println("=====: Appartment " + (i + 1) + " Details  :======");

		int appartmentNumber = i + 1;
		System.out.println("Enter Unit Consumed: ");
		double unitConsumed = scanner.nextDouble();

		electricity[i] = new ElectricityBill(unitConsumed, appartmentNumber);

	}

	private static ElectricityBill findAppartmentId(ElectricityBill[] electricity, int AppartmentNumber) {
		for (int i = 0; i < electricity.length; i++) {
			if (electricity[i] != null && electricity[i].getApartmentNumber() == AppartmentNumber) {
				return electricity[i];
			}
		}
		return null;
	}
}
