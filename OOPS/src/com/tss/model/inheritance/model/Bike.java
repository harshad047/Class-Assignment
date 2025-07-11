package com.tss.model.inheritance.model;

public class Bike extends VehicleRental {

	private double rent;
	public Bike(int vehicleNumber, int rentPerDay, String fuelType) {
		super(vehicleNumber, rentPerDay, fuelType);
	}
	
	public void calculateRent(int numberOfDays) {
		// TODO Auto-generated method stub
		if(numberOfDays>5)
		{
		rent = (numberOfDays * rentPerDay)*0.9;
		return;
		}
		rent = (numberOfDays * rentPerDay)*0.9;
	}
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Rent: "+rent);	
		}
}
