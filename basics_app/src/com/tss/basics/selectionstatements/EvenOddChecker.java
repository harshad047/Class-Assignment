package com.tss.basics.selectionstatements;

import java.util.Scanner;



public class EvenOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for you want to check for it:-");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
