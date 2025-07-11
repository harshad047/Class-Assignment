package com.tss.basics.iterativestatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:-");
		int number = sc.nextInt();
		int temp = number;

		while (number > 0) {
			int digit = number % 10;
			rev = (rev * 10) + digit;
			number = number / 10;
		}
		if (temp == rev) {
			System.out.println(temp + " number is palindrome");
		} else {
			System.out.println(temp + " number is not palindrome");
		}
	}

}
