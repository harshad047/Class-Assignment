package com.tss.basics.commandline;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		double radius = Double.parseDouble(args[0]);
		

		areaofcircle(radius);

	}
	private static void areaofcircle(double radius)
	{
		double pi = 3.14;
		double area = pi * radius*radius;
		System.out.println("Area of circle:-"+area);
	}

}
