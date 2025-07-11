package com.tss.model;

public class ElectricityBill {
	private double unitsConsumed;
	private static double costPerUnit=7;
	private int apartmentNumber;
	public double getUnitsConsumed() {
		return unitsConsumed;
	}
	public ElectricityBill(double unitsConsumed, int appartmentNumber) {
		this.unitsConsumed = unitsConsumed;
		this.apartmentNumber = appartmentNumber;
	}
	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public static double getCostPerUnit() {
		return costPerUnit;
	}
	public static void setCostPerUnit(double costPerUnit) {
		ElectricityBill.costPerUnit = costPerUnit;
	}
	public int getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	public double calculateBill()
	{
		return this.unitsConsumed*ElectricityBill.costPerUnit;
	}
	public void display()
	{
		System.out.println("Apartment Number: "+this.apartmentNumber);
		System.out.println("Unit Consumed: "+this.unitsConsumed);
		System.out.println("Bill To be paid: "+calculateBill());
	}
}
