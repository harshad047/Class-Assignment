package com.tss.test;

import java.util.Scanner;

public class EvenTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = scanner.nextInt();
		
		if(number%2!=0)
		{
			System.out.println("number is not even");
			return;
		}
		System.out.println("number is even");
	}

}
