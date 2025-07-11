package com.tss.basics.selectionstatements;

import java.util.Scanner;

public class CalculateBillingCharge {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of unit consumed :-");
		float units = sc.nextFloat();
		
		caculatewaterbill(units);

	}
	private static void caculatewaterbill(float units)
	{
		int meter_charge = 75;
		float charge;	
		float total_water_bill;
		if(units<=100)
		{
			charge = (units*5);
		}
		else
		{
			if(units<=250)
			{
				charge = (units*10);
			}
			else
			{
				charge = units*20;
			}
		}
		
		total_water_bill = meter_charge + charge;
		System.out.println("Total Water bill is:-"+total_water_bill);
		
	}
}
