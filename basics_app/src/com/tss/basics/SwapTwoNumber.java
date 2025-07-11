package com.tss.basics;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:-");
		int number1 = sc.nextInt();
		
		System.out.println("Enter NUmber 2:-");
		int number2 = sc.nextInt();	
		
		swaptwonumwiththird(number1,number2);
		swaptwonumwithoutthird(number1,number2);
		

	}
	
	private static void swaptwonumwiththird(int num1,int num2)
	{
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swaping:-");
		System.out.println("num1:-"+num1);
		System.out.println("num2:-"+num2);
		
		
	}
	
	private static void swaptwonumwithoutthird(int num1,int num2)
	{
		num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
      
        System.out.println("num1 = " + num1 + " num2 = " + num2);
		
	}


}
