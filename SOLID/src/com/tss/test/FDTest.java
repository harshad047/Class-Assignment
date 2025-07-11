package com.tss.test;

import com.tss.model.FestivalType;
import com.tss.model.FixedDeposit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FDTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<FixedDeposit> fdList = new ArrayList<>();

		System.out.print("Enter the number of Fixed Deposits you want to create: ");
		int count = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < count; i++) {
			System.out.println("\nEnter details for Fixed Deposit #" + (i + 1) + ":");

			System.out.print("Account Number: ");
			int accountNumber = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Principal Amount: ");
			double principal = scanner.nextDouble();

			System.out.print("Duration (in years): ");
			int duration = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Choose Festival Type:");
			System.out.println("1. NEWYEAR");
			System.out.println("2. DIWALI");
			System.out.println("3. HOLI");
			System.out.println("4. OTHERS");

			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			FestivalType festivalType;
			switch (choice) {
			case 1:
				festivalType = FestivalType.NEWYEAR;
				break;
			case 2:
				festivalType = FestivalType.DIWALI;
				break;
			case 3:
				festivalType = FestivalType.HOLI;
				break;
			default:
				festivalType = FestivalType.OTHERS;
				break;
			}

			FixedDeposit fd = new FixedDeposit(accountNumber, name, principal, duration, festivalType);
			fdList.add(fd);
		}

		System.out.println("\n=== Fixed Deposit Summary ===");
		for (FixedDeposit fd : fdList) {
			System.out.println("------------------------------");
			System.out.println("Account Number: " + fd.getAccountNumber());
			System.out.println("Name: " + fd.getName());
			System.out.println("Principal: " + fd.getPrincipal());
			System.out.println("Duration: " + fd.getDuration() + " years");
			System.out.println("Festival: " + fd.getFestival());
			System.out.println("Interest Rate: " + fd.getInterestRate() + "%");
			System.out.println("Calculated Simple Interest: " + fd.calculateSimpleInterest());
		}

		scanner.close();
	}
}
