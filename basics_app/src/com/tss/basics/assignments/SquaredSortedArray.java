package com.tss.basics.assignments;

import java.util.Scanner;

public class SquaredSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array:- ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		int arr_squared[] = new int[size];

		System.out.println("Enter Element in manner that array will be sorted:- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
	
		int left = 0;
		int right = size-1;
		int index = size-1;
		
		while(left<=right)
		{
			int leftsquared = arr[left]*arr[left];
			int rightsquared = arr[right]*arr[right];
			
			if(leftsquared > rightsquared)
			{
				arr_squared[index] = leftsquared;
				left++;
			}
			else
			{
				arr_squared[index] = rightsquared;
				right--;
			}
			index--;
		}
		System.out.println("Element of array are:- ");
		for(int i= 0;i<arr.length;i++)
		{
			System.out.print(arr_squared[i]+"\t");
			
		}
		
	}

}
