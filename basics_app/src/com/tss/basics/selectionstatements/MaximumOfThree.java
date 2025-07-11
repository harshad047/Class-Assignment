package com.tss.basics.selectionstatements;

import java.util.Scanner;

public class MaximumOfThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:-");
		int number1 = sc.nextInt();
		
		System.out.println("Enter NUmber 2:-");
		int number2 = sc.nextInt();	
		
		System.out.println("Enter NUmber 3:-");
		int number3 = sc.nextInt();
		
		maximumofthree(number1,number2,number3);

	}
	
	private static void maximumofthree(int number1,int number2, int number3)
	{
		if(number1>number2)
		{
			if(number1>number3)
			{
			System.out.println(number1 + " is greater than "+ number2+","+number3);
			}
		}
		else
		{
			if(number2>number3)
			{
				System.out.println(number2 + " is greater than "+ number1+","+number3);
			}
			else
			{
				System.out.println(number3 + " is greater than "+ number1+","+number2);
			}
		}
	}

}
