package com.tss.structural.decorator.test;

import java.util.Scanner;

import com.tss.structural.decorator.model.CarInspection;
import com.tss.structural.decorator.model.ICarService;
import com.tss.structural.decorator.model.OilChange;
import com.tss.structural.decorator.model.WheelAlign;

public class VehicleTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ICarService service = new CarInspection();

		System.out.println("Base Service: Car Inspection: ");

		boolean running = true;
		boolean oilChange = true;

		while (running) {
			System.out.println("\nAdd Extra Services:");
			System.out.println("1. Oil Change ");
			System.out.println("2. Wheel Alignment ");
			System.out.println("3. Both Oil Change & Wheel Alignment");
			System.out.println("4. Show Total Cost & Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				if (oilChange) {
					service = new OilChange(service);
					System.out.println("Oil Change added.");
					oilChange = false;
					break;
				}
				System.out.println("Oil Already Change");
				break;
			case 2:
				service = new WheelAlign(service);
				System.out.println("Wheel Alignment added.");
				break;
			case 3:
				if (oilChange) {
					service = new OilChange(service);
					service = new WheelAlign(service);
					System.out.println("Both Oil Change & Wheel Alignment added.");
					oilChange = false;
					break;
				}
				System.out.println("Oil Already Change");
				service = new WheelAlign(service);
				System.out.println("Wheel Alignment added.");
				break;
			case 4:
				System.out.println("\nTotal Service Cost: " + service.getCost());
				running = false;
				break;
			default:
				System.out.println("Invalid option. Try again.");
				break;
			}
		}

		scanner.close();
	}

}
