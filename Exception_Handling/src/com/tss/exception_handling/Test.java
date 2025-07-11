package com.tss.exception_handling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		
		try {
			System.out.println("Enter Number 1: ");
			int number1 = scanner.nextInt();
			System.out.println("Enter Number 2: ");
			int number2 = scanner.nextInt();
			float result = number1 / number2;
			System.out.println("Division is: " + result);
		} catch (Exception exception) {
			System.out.println(exception + " \nEnter some other value");
		}
		finally
		{
			System.out.println("Final");
		}
		System.out.println("Exiting");
	}
}
