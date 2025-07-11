package com.tss.model;

import com.tss.exception.InsufficientWaterException;
import com.tss.exception.OverfillException;

public class WaterDispenser {

	private int currentWaterLevel;
	private int maxWaterCapacity = 100;

	public WaterDispenser() {
		this.currentWaterLevel = 0;
	}

	public int getCurrentWaterLevel() {
		return currentWaterLevel;
	}

	public void setCurrentWaterLevel(int currentWaterLevel) {
		this.currentWaterLevel = currentWaterLevel;
	}

	public void fillWater(int waterAmount) {
		if (waterAmount < 0) {
			System.out.println("Enter Water Amount In Positive Integer");
			return;
		}
		if (this.currentWaterLevel + waterAmount > maxWaterCapacity) {
			throw new OverfillException();
		}
		this.setCurrentWaterLevel(currentWaterLevel + waterAmount);
		System.out.println(waterAmount + ": liters Water Added to Tank Successfully !");
	}

	public void dispenseWater(int waterAmount) {
		if (waterAmount < 0) {
			System.out.println("Enter Water Amount In Positive Integer");
			return;
		}
		if (waterAmount > this.currentWaterLevel) {
			throw new InsufficientWaterException(this.getCurrentWaterLevel(), waterAmount);
		}
		this.setCurrentWaterLevel(currentWaterLevel - waterAmount);
		System.out.println(waterAmount + ": liters Water Dispensed !");
	}
}
