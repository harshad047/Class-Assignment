package com.tss.basics.selectionstatements;

import java.util.Scanner;

public class MaximumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:-");
		int number1 = sc.nextInt();
		
		System.out.println("Enter NUmber 2:-");
		int number2 = sc.nextInt();	
		
		maximumoftwo(number1,number2);

	}
	
	private static void maximumoftwo(int number1,int number2)
	{
		if(number1>number2)
		{
			System.out.println(number1 + " is greqater than "+number2);
		}
		else
		{
			System.out.println(number2 + " is greqater than "+number1);

		}
	}

}
