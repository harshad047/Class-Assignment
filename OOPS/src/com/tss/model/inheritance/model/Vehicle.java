package com.tss.model.inheritance.model;

public class Vehicle {

	private String model;
	private int year,price;
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public Vehicle(String model, int year, int price) 
	{
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public void startEngine()
	{
		System.out.println("Start Engine");
	}
	public void stopEngine()
	{
		System.out.println("Stop Enging");
	}
	public void displayInfo()
	{
		System.out.println("model: "+model);
		System.out.println("year: "+year);
		System.out.println("price: "+price);
	}
	
	
	
	
}
