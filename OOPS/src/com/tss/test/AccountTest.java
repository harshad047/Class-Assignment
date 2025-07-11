package com.tss.test;

import com.tss.model.Account;
import com.tss.model.AccountType;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;

		boolean loop = true;
		while (loop) {
			System.out.println("\n====== Menu ======");
			System.out.println("1. Create Account");
			System.out.println("2. Display Balance");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Account ID: ");
				int id = sc.nextInt();
				System.out.print("Enter Account Number: ");
				String number = sc.next();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Initial Balance: ");
				int balance = sc.nextInt();
				sc.nextLine();
				boolean isAccountType = true;
				while (isAccountType) {
					System.out.print("Enter Account Type (savings/current/FD): ");
					String accountType = sc.nextLine();
					if (accountType.equalsIgnoreCase("savings")) {
						account = new Account(id, number, name, balance, AccountType.SAVINGS);
						isAccountType = false;
					} else if (accountType.equalsIgnoreCase("current")) {
						account = new Account(id, number, name, balance, AccountType.CURRENT);
						isAccountType = false;
					} else if (accountType.equalsIgnoreCase("FD")) {
						account = new Account(id, number, name, balance, AccountType.FD);
						isAccountType = false;
					} else {
						System.out.println("Enter Valid things!!");
						isAccountType = true;
					}

				}
				System.out.println("Account created successfully.");
				break;

			case 2:
				if (account != null) {
					System.out.println("Current Balance: " + account.getBalance());
				} else {
					System.out.println("No account found. Please create one first.");
				}
				break;

			case 3:
				if (account != null) {
					System.out.print("Enter deposit amount: ");
					int depositAmount = sc.nextInt();
					account.depositAmount(depositAmount);
				} else {
					System.out.println("No account found. Please create one first.");
				}
				break;

			case 4:
				if (account != null) {
					System.out.print("Enter withdrawal amount: ");
					int withdrawAmount = sc.nextInt();
					account.withdrawAmount(withdrawAmount);
				} else {
					System.out.println("No account found. Please create one first.");
				}
				break;

			case 5:
				System.out.println("Exiting. Thank you!");
				loop = false;
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
