package com.tss.model.inheritance.test;

import java.util.Scanner;

import com.tss.model.inheritance.model.Bike;
import com.tss.model.inheritance.model.CarRental;
import com.tss.model.inheritance.model.VehicleRental;

public class VehicleRentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleRental vehicle = null;
		
		int bikeRentPerDay = 500;
		int carRentPerDay = 1000;
		int truckRentPerDay = 1500;
		
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		int numberOfDays;
		while(loop)
		{
			System.out.println("===Rental System===");
			System.out.println("1. Car Rent");
			System.out.println("2. Bike Rent");
			System.out.println("3. Truck Rent");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice: ");
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Your Car Number: ");
				int carNumber = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Your Car Fuel Type: ");
				String fuelType = scanner.nextLine();
				
				vehicle = new CarRental(carNumber,carRentPerDay,fuelType);
				
				System.out.println("Enter Number of Days: ");
				numberOfDays = scanner.nextInt();
				
				vehicle.calculateRent(numberOfDays);
				vehicle.displayDetails();
				
				break;
				
			case 2:
				System.out.println("Enter Your Bike Number: ");
				int bikeNumber = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Your Bike Fuel Type: ");
				String bikeFuelType = scanner.nextLine();
				
				vehicle = new Bike(bikeNumber,bikeRentPerDay,bikeFuelType);
				
				System.out.println("Enter Number of Days: ");
				numberOfDays = scanner.nextInt();
				
				vehicle.calculateRent(numberOfDays);
				vehicle.displayDetails();
				
				break;
				
			case 3:
				System.out.println("Enter Your Truck Number: ");
				int truckNumber = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Your Truck Fuel Type: ");
				String truckFuelType = scanner.nextLine();
				
				vehicle = new Bike(truckNumber,truckRentPerDay,truckFuelType);
				  
				System.out.println("Enter Number of Days: ");
				numberOfDays = scanner.nextInt();
				
				vehicle.calculateRent(numberOfDays);
				vehicle.displayDetails();
				
				break;
				
			case 4:
				System.out.println("Exiting....");
				loop = false;
				break;
			
			default:
				System.out.println("Invalid");
			}
			
		}
	}

}
