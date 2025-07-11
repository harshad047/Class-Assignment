package com.tss.model;

public class Account {
	private int accountId;
	private double balance;
	private String name,accountNumber;
	private AccountType accountType;

	public Account(int accountId, String accountNumber, String name, double balance, AccountType accountType) {
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	@Override
	public String toString() {
		return "[accountId=" + accountId + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", name=" + name + ", accountType=" + accountType + "]";
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void depositAmount(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposited: " + amount + ". New balance: " + this.balance);
		} else {
			System.out.println("Invalid deposit amount. Please enter a positive value.");
		}
	}

	public void withdrawAmount(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient Balance");
		} else {
			if ((balance - amount) >= 500) {
				balance = balance - amount;
				System.out.println("Withdrawed: "+amount+" New Balance: "+this.balance);
			} else {
				System.out.println("Insufficient balance");
			}
		}
	}
}
