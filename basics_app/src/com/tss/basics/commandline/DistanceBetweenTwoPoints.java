package com.tss.basics.commandline;
public class DistanceBetweenTwoPoints {
	public static void main(String[] args) {
		double x1 = Double.parseDouble(args[0]);
		double x2 = Double.parseDouble(args[1]);
		double y1 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		distancebetweentwopoints(x1,x2,y1,y2);
	}
	private static void distancebetweentwopoints(double x1,double x2, double y1, double y2)
	{
	double distance = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
	System.out.println("Distance between Two points:-"+distance);
	}
}