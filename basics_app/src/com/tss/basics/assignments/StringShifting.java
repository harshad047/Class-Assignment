package com.tss.basics.assignments;

import java.util.Scanner;

public class StringShifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String:- ");
		String s1 = scanner.next();
		
		System.out.println("Enter the shifts you want in all character:- ");
		int shifts = scanner.nextInt();
		
		char chars[] = s1.toCharArray();
		
		for(int i =0;i<chars.length;i++)
		{
			char character = chars[i];
			int assci_of_character = (int) character;
			
			if(assci_of_character >=65 && assci_of_character <=90)
			{
				assci_of_character = assci_of_character +  shifts;
				if(assci_of_character > 90)
				{
					assci_of_character = (assci_of_character - 65) % 26 + 65;
				}
				else if(assci_of_character < 65)
				{
					assci_of_character = (assci_of_character - 65)%26 +(26+65);
				}
			}
			else if(assci_of_character>=97 && assci_of_character <=122)
			{
				assci_of_character = assci_of_character+shifts;
				if(assci_of_character > 122)
				{
					assci_of_character = (assci_of_character - 97) % 26 + 97;
				}
				else if(assci_of_character < 97)
				{
				assci_of_character = (assci_of_character - 97) % 26 +(26+97);
				}
			}
			chars[i] = (char) assci_of_character;
		}
		
		String shifted_string = new String(chars);
		
		System.out.println("Original String:- "+s1);
		System.out.println("Shifted String:- "+shifted_string);
	}
}
