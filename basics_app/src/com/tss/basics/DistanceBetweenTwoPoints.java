package com.tss.basics;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of x1:-");
		double x1 = sc.nextDouble();
		
		System.out.println("Enter value of x2:-");
		double x2 = sc.nextDouble();
		
		System.out.println("Enter value of y1:-");
		double y1 = sc.nextDouble();
		
		System.out.println("Enter value of y2:-");
		double y2 = sc.nextDouble();
		
		distancebetweentwopoints(x1,x2,y1,y2);
		
		}
	private static void distancebetweentwopoints(double x1,double x2, double y1, double y2)
	{
		double distance = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
		System.out.println("Distance between Two points"+distance);
	}


}
