package com.tss.model.inheritance.test;

import com.tss.model.inheritance.model.ElectricCar;

public class ElectricCarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar car = new ElectricCar("Tesla",2020,10000,4,92);
		car.displayInfo();
		car.displayBatteryStatus();
		car.lockDoors();
		car.unlockDoors();
		car.chargeBattery();

	}
	
}

