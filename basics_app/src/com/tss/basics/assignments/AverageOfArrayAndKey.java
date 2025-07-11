package com.tss.basics.assignments;

import java.util.Scanner;

public class AverageOfArrayAndKey {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of array:- ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		int sum = 0;

		System.out.println("Enter Element Of Array:- ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		double average = (double) sum / size;
		int target = (int) average;

		System.out.println("Average" + target);

		int[] sorted_arr = sort_array(arr);

		get_keys(sorted_arr, target);

	}

	private static int[] sort_array(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
		return arr;
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	private static void get_keys(int[] sorted_arr, int target) {
		int left = 0;
		int right = sorted_arr.length - 1;

		while (left <= right) {
			int sum = sorted_arr[left] + sorted_arr[right];

			if (sum == target) {
				System.out.println("Match Found element 1 is " + sorted_arr[left] + "and element 2 is " + sorted_arr[right]);
				return;
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}

		System.out.println("Mathch not found !!");
		return;
	}
}
