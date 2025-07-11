package com.tss.basics.iterativestatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:-");
		int number = sc.nextInt();

		while (number > 0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}

		System.out.println("Sum of digits: " + sum);
	}

}
