package com.tss.structural.adapter.model;

public class Chocolate implements IItems{

	private String name;
	private double mrp;
	
	public Chocolate(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String getItemName() {
		return name;
	}

	@Override
	public double getItemPrice() {
		return mrp;
	}

}
