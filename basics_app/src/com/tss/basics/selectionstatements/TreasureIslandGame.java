package com.tss.basics.selectionstatements;

import java.util.Scanner;

public class TreasureIslandGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in which directionyou want to go (Left or Right): ");
		String move1 = sc.next();

		if (move1.equalsIgnoreCase("left")) {
			System.out.println("Enter Wheather you want to Swim or Wait: ");
			String move2 = sc.next();

			if (move2.equalsIgnoreCase("wait")) {
				System.out.println("Choose a color of door: ");
				String move3 = sc.next();

				if (move3.equalsIgnoreCase("yellow")) {
					System.out.println("You win");
				} else if (move3.equalsIgnoreCase("red")) {
					System.out.println("Burned by fire Game over");
				} else if (move3.equalsIgnoreCase("blue")) {
					System.out.println("Eaten By beasts Game over");
				} else {
					System.out.println("Game Over");
				}
			} else {
				System.out.println("Attacked by trout or Game Over");
			}
		} else {
			System.out.println("you Fall into a hole Game Over");
		}
	}

}
