package com.tss.model.inheritance.model;

public class CarRental extends VehicleRental {

	private double rent;
	public CarRental(int vehicleNumber, int rentPerDay, String fuelType) {
		super(vehicleNumber, rentPerDay, fuelType);
	}

	public void calculateRent(int numberOfDays) {
		// TODO Auto-generated method stub
		rent = numberOfDays * rentPerDay;
	}
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Rent: "+rent);	
		}
}
