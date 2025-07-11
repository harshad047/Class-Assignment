package com.tss.basics.array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int arr [] = new int[5];
		
		System.out.println("Enter Element of array:- ");
		for(int i= 0;i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Element of array are:- ");
		for(int i= 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
