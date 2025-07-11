package com.tss.model.inheritance.model;

public class NewRectangle implements IShape {

	private double length, bredth;

	public NewRectangle(double length, double bredth) {
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is: " + length * bredth);

	}

}
