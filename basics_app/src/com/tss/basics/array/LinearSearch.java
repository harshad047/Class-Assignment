package com.tss.basics.array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array:- ");
		int n = scanner.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter Element of array:- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter a value of element that you want to search in array:-");
		int search = scanner.nextInt();

		linearsearch(arr, search);

	}

	private static void linearsearch(int[] arr, int search) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				System.out.println("Element is found on position " + (i + 1));
				return;
			}
		}
		System.out.println("Element is not found");
	}
}
