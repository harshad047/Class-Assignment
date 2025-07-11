package com.tss.basics.selectionstatements;

import java.util.Random;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int generated_number = random.nextInt(4)+1;
		
		switch(generated_number)
		{
		case 1:System.out.println("One");
		break;
		case 2:System.out.println("Two");
		break;
		case 3:System.out.println("Three");
		break;
		default:
			System.out.println("default");
		}
	}

}
