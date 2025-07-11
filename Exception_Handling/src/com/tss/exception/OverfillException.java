package com.tss.exception;

public class OverfillException extends RuntimeException {

	private int maxCapacity = 100;

	public String getMessage() {
		return "Your Tank maximum Capacity is " + maxCapacity;
	}

}
