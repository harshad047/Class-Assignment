package com.tss.test;

import java.util.Scanner;
import java.util.Random;
import com.tss.model.Account;
import com.tss.model.AccountType;

public class AccountTest1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number Of Account You Want to Open: ");
		int numberOfAccount = scanner.nextInt();
		scanner.nextLine();

		Account[] Accounts = new Account[numberOfAccount];

		for (int i = 0; i < Accounts.length; i++) {
			getInfo(scanner, Accounts, i);
		}

		for (int i = 0; i < Accounts.length; i++) {
			System.out.println(Accounts[i].toString());
		}

		int accountId;
		Account account;
		boolean loop = true;
		while (loop) {
			System.out.println("\n====== Menu ======");
			System.out.println("1. Display Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Account Id");
				accountId = scanner.nextInt();

				account = findAccountId(Accounts, accountId);
				if (account != null) {
					System.out.println("Current Balance: " + account.getBalance());
				} else {
					System.out.println("No account found. Please create one first.");
				}
				break;

			case 2:
				System.out.println("Enter Account Id");
				accountId = scanner.nextInt();
				account = findAccountId(Accounts, accountId);
				if (account != null) {
					System.out.print("Enter deposit amount: ");
					double depositAmount = scanner.nextInt();
					account.depositAmount(depositAmount);
				} else {
					System.out.println("No account found. Please create one first.");
				}
				break;

			case 3:
				System.out.println("Enter Account Id");
				accountId = scanner.nextInt();
				account = findAccountId(Accounts, accountId);
				if (account != null) {
					System.out.print("Enter withdrawal amount: ");
					double withdrawAmount = scanner.nextInt();
					account.withdrawAmount(withdrawAmount);
				} else {
					System.out.println("No account found. Please create one first.");
				}
				break;

			case 4:
				System.out.println("Enter Sender's Account Id: ");
				int senderAccountId = scanner.nextInt();
				Account senderAccount = findAccountId(Accounts, senderAccountId);

				System.out.println("Enter Receiver's Account Id: ");
				int receiverAccountId = scanner.nextInt();
				Account receiverAccount = findAccountId(Accounts, receiverAccountId);

				if (senderAccountId == receiverAccountId) {
					System.out.println("Can't Transfer in Same Account");
					break;
				}
				System.out.println("Enter Amount You Want to Transfer: ");
				double amount = scanner.nextInt();

				if (senderAccount == null || receiverAccount == null) {
					System.out.println("Enter Valid Sender Or Receiver Id");
				} else {
					if (amount > senderAccount.getBalance()) {
						System.out.println("Insufficient funds in sender's account.");
					} else {
						senderAccount.withdrawAmount(amount);
						receiverAccount.depositAmount(amount);
						System.out.println("Transferred Successfully");
						System.out.println("Sender's New Balance: " + senderAccount.getBalance()+ " Receiver's New Balance: " + receiverAccount.getBalance());
					}
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

	private static void getInfo(Scanner scanner, Account account[], int i) {
		System.out.println("=====: Account " + (i + 1) + " Details Form :======");

		int accountId = i + 1;
		String accountNumber = generateAccountNumber(account, i);
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Initial Balance: ");
		double balance = scanner.nextInt();
		scanner.nextLine();
		boolean isAccountType = true;
		while (isAccountType) {
			System.out.print("Enter Account Type (savings/current/FD): ");
			String accountType = scanner.nextLine();
			if (accountType.equalsIgnoreCase("savings")) {
				account[i] = new Account(accountId, accountNumber, name, balance, AccountType.SAVINGS);
				isAccountType = false;
			} else if (accountType.equalsIgnoreCase("current")) {
				account[i] = new Account(accountId, accountNumber, name, balance, AccountType.CURRENT);
				isAccountType = false;
			} else if (accountType.equalsIgnoreCase("FD")) {
				account[i] = new Account(accountId, accountNumber, name, balance, AccountType.FD);
				isAccountType = false;
			} else {
				System.out.println("Enter Valid things!!");
				isAccountType = true;
			}

		}
		System.out.println("Account created successfully.");
	}

	private static String generateAccountNumber(Account[] accounts, int i) {
		Random random = new Random();
		String accountNumber;
		String prefix = "AXIS1000";

		int randomNumber = random.nextInt(100000, 1000000);
		accountNumber = prefix + randomNumber;

		if (i == 0) {
			return accountNumber;
		} else {
			for (int j = 0; j < accounts.length; j++) {
				if (accounts[j] != null) {
					if (accounts[j].getAccountNumber().equals(accountNumber)) {
						return generateAccountNumber(accounts, i);
					}
				}
			}
			return accountNumber;
		}
	}

	private static Account findAccountId(Account[] accounts, int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountId() == accountId) {
				return accounts[i];
			}
		}
		return null;
	}

}
