package com.tss.test;

import java.util.Scanner;

import com.tss.exception.InsufficientWaterException;
import com.tss.exception.OverfillException;
import com.tss.model.WaterDispenser;

public class WaterDispenserTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("+-----------------------------------------+");
		System.out.println("|    Welcome to Digital Water Dispenser   |");
		System.out.println("+-----------------------------------------+");

		WaterDispenser waterDispenser = new WaterDispenser();

		boolean loop = true;
		int waterAmount;

		while (loop) {
			System.out.println("+-----------------------------------------+");
			System.out.println("|----------Water Dispenser Menu-----------|");
			System.out.println("|1. Fill Water                            |");
			System.out.println("|2. Dispense Water                        |");
			System.out.println("|3. Display Current Water level           |");
			System.out.println("|4. Exit                                  |");
			System.out.println("+-----------------------------------------+");
			System.out.print("Enter Your Choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				try {
					System.out.print("Enter Amount Of Water In Liters For Filling: ");
					waterAmount = scanner.nextInt();
					waterDispenser.fillWater(waterAmount);
				} catch (OverfillException e) {
					System.out.println(e.getMessage());
				} finally {
					System.out.println("Current Water Level: " + waterDispenser.getCurrentWaterLevel());
				}
				break;

			case 2:
				try {
					System.out.print("Enter Amount Of Water In Liters For  Dispensing: ");
					waterAmount = scanner.nextInt();
					waterDispenser.dispenseWater(waterAmount);
				} catch (InsufficientWaterException e) {
					System.out.println(e.getMessage());
				} finally {
					System.out.println("Current Water Level: " + waterDispenser.getCurrentWaterLevel());
				}
				break;
				
			case 3:
				System.out.println("Current Water Level: " + waterDispenser.getCurrentWaterLevel());
				break;
				
			case 4:
				System.out.println("Exiting.....");
				loop = false;
				break;

			default:
				System.out.println("Invalid Choice !!!");
			}

		}

	}

}
