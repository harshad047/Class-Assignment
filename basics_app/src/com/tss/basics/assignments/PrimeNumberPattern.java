package com.tss.basics.assignments;

import java.util.Scanner;

public class PrimeNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Rows You Want In Pattern: ");
		int rows = sc.nextInt();

		int number = 2;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				while (!is_prime(number)) {
					number++;
				}

				System.out.print(number + " ");
				number++;

			}
			System.out.println();
		}
	}

	private static boolean is_prime(int number) {
		int i = 2;
		while (i <= number / 2) {
			if (number % i == 0) {
				return false;
			}
			i++;
		}
		return true;

	}

}