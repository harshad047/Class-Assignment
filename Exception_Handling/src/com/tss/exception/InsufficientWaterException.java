package com.tss.exception;

public class InsufficientWaterException extends RuntimeException {
	private int currentWaterLevel;
	private int requestedWaterLevel;

	public InsufficientWaterException(int currentWaterLevel, int requestedWaterLevel) {
		super();
		this.currentWaterLevel = currentWaterLevel;
		this.requestedWaterLevel = requestedWaterLevel;
	}

	public String getMessage() {
		return "Insufficient Water in Tank: Current Water Level = " + currentWaterLevel + ": Requested Water ="
				+ requestedWaterLevel;
	}
}
