package com.tss.basics;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount:-");
		int principal_amount = sc.nextInt();
		
		System.out.println("Enter Rate Of Interest:-");
		double rate_of_interest = sc.nextDouble();	
		
		System.out.println("Enter Time Duration:-");
		float time_duration = sc.nextFloat();
		
		simpleinterest(principal_amount,rate_of_interest,time_duration);

	}
	
	private static void simpleinterest(int principal_amount,double rate_of_interest, float time_duration)
	{
		double simpleinterest =((principal_amount*rate_of_interest*time_duration)/ 100);
		System.out.println("Simple Interest is:-"+simpleinterest);
	}

}
