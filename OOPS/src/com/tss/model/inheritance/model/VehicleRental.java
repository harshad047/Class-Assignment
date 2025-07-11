package com.tss.model.inheritance.model;

public abstract class VehicleRental {
	
	protected int vehicleNumber,rentPerDay;
	protected String fuelType;
	
	public VehicleRental(int vehicleNumber, int rentPerDay, String fuelType) {
		this.vehicleNumber = vehicleNumber;
		this.rentPerDay = rentPerDay;
		this.fuelType = fuelType;
	}

	public abstract void calculateRent(int numberOfDays);
	
	public abstract void displayDetails();
	
}
