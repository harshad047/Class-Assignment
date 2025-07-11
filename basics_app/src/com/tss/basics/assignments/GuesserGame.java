package com.tss.basics.assignments;

import java.util.Scanner;
import java.util.Random;

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean want_play = true;

		System.out.println("Welcome to the Number Guesser Game !!!");
		while(want_play)
		{
			int generated_number = random.nextInt(100)+1;
			guess_game(generated_number,scanner);
			
			System.out.println("Enter yes if you want to play again: ");
			String playagain = scanner.next();
			
			if(playagain.equalsIgnoreCase("yes"))
			{
				want_play = true;
			}
			else
			{
				want_play = false;
			}
		}
		System.out.print("Thank You For Visiting !!");
	}

	private static void guess_game(int number,Scanner scanner)
	{
		int attempt = 1;
		while(attempt<=5)
		{
			System.out.print("Guess The Number Between 1-100: ");
			int guessed_number = scanner.nextInt();
			
			if(guessed_number == number)
			{
				System.out.println("You won the Game in Attempt number "+attempt);
				break;
			}
			else if(guessed_number < number)
			{
				System.out.println("Sorry, Too Low !!");
			}
			else
			{
				System.out.println("Sorry, Too High !!");
			}
			attempt++;
		}
		
		System.out.println("Too Close! but You lose! The correct number was: " + number);
	}
}
