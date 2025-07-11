package com.tss.basics.assignments;

import java.util.Scanner;

public class StringSubString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String:- ");
		String string = scanner.next().toLowerCase();

		System.out.println("Enter the Substring for that you want to check:-");
		String sub_string = scanner.next().toLowerCase();

		char string_arr[] = string.toCharArray();
		char sub_string_arr[] = sub_string.toCharArray();

		if (sub_string_arr.length > string_arr.length) {
			System.out.println("Substring is longer than the main string. Not possible.");
			return;
		}

		if (issubstring(string_arr, sub_string_arr)) {
			System.out.println("Substring Found in String");
		} else {
			System.out.println("Substring not found");
		}
	}

	private static boolean issubstring(char[] string_arr, char[] sub_string_arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < string_arr.length - 1; i++) {
			int j;
			for (j = 0; j < sub_string_arr.length; j++) {
				if (string_arr[i + j] != sub_string_arr[j]) {
					break;
				}
			}
			if (j == sub_string_arr.length) {
				return true;
			}
		}
		return false;
	}

}
