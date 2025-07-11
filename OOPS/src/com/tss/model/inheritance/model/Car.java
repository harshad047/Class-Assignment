package com.tss.model.inheritance.model;

public class Car extends Vehicle{
	
	
	private int numberOfDoors;
	
	public Car(String model, int year, int price,int numberOfDoors)
	{
		super(model,year,price);
		this.numberOfDoors = numberOfDoors;
	}
	public void lockDoors()
	{
		System.out.println(super.getModel()+" Car Door lock");
	}
	public void unlockDoors()
	{
		System.out.println(super.getModel()+" Car Door unlock");
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}
