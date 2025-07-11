package com.tss.basics;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1:-");
		int number1 = sc.nextInt();
		
		System.out.println("Enter NUmber 2:-");
		int number2 = sc.nextInt();		
		
		addition(number1,number2);
		subtraction(number1,number2);
		multiplication(number1,number2);
		division(number1,number2);

	}
	
	private static void addition(int num1,int num2)
	{
		int sum = num1+num2;
		System.out.println("Sum ="+sum);
		
	}
	private static void subtraction(int num1,int num2)
	{
		int sub = num1-num2;
		System.out.println("Sub ="+sub);
		
	}
	private static void multiplication(int num1,int num2)
	{
		int mul = num1*num2;
		System.out.println("Mul ="+mul);
		
	}
	private static void division(int num1,int num2)
	{
		int div = num1/num2;
		System.out.println("Div ="+div);
		
	}
}
