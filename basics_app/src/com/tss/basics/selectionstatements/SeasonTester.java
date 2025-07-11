package com.tss.basics.selectionstatements;

import java.util.Scanner;

public class SeasonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first three letter of month: ");
		String month = scanner.next().toLowerCase();
		
		
		switch(month)
		{
		case "jan": case "feb" :case "nov" : case "dec":
			System.out.println("Winter");
			break;
			
		case "may": case "jun" :case "mar" : case "apr":
			System.out.println("Summer");
			break;
		
		case "sep": case "oct" :case "jul" : case "aug":
			System.out.println("Rainy");
			break;
		
		default:
			System.out.println("Enter valid month !!!");
		
		}
	}

}
