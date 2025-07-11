package com.tss.model.inheritance.model;

public class NewCircle implements IShape {

	private double radius;

	public NewCircle(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area Of Circle is: " + IShape.pi * radius * radius);
	}

}
