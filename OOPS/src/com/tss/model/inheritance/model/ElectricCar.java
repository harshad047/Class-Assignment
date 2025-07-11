package com.tss.model.inheritance.model;

public class ElectricCar extends Car {

	private int batteryLevel;
	
	public ElectricCar(String model, int year, int price,int numberOfDoors,int batteryLevel)
	{
		super(model,year,price,numberOfDoors);
		this.batteryLevel = batteryLevel;
	}
	
	public void chargeBattery()
	{
		System.out.println(super.getModel()+ " Car Charging");
	}
	public void displayBatteryStatus()
	{
		System.out.println("Battery Level: "+batteryLevel);
	}
	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

}
