package com.tss.model.inheritance.test;

import java.util.Scanner;

import com.tss.model.inheritance.model.CreditCard;
import com.tss.model.inheritance.model.DebitCard;
import com.tss.model.inheritance.model.PayPal;
import com.tss.model.inheritance.model.PaymentMethod;
import com.tss.model.inheritance.model.Upi;

public class PaymentMethodTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		PaymentMethod paymentMethod = null;

		boolean loop = true;
		while (loop) {
			System.out.println();
			System.out.println("+----------------------------+");
			System.out.println("|   Select Payment Method    |");
			System.out.println("+----------------------------+");
			System.out.println("| 1. Credit Card             |");
			System.out.println("| 2. Debit Card              |");
			System.out.println("| 3. UPI                     |");
			System.out.println("| 4. PayPal                  |");
			System.out.println("| 5. Exit                    |");
			System.out.println("+----------------------------+");

			System.out.print("Select Payment Method: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				while (true) {
					long cardNumber = inputCardNumber(scanner);
					scanner.nextLine();
					String cardHolder = inputCardHolder(scanner);
					int pin = setUpPin(scanner);
					paymentMethod = new CreditCard(cardNumber, cardHolder, pin);
					if (paymentMethod.validatePaymentDetails()) {
						paymentMethod.processPayment();
						break;
					}
					System.out.println("Enter Valid Details...");
				}
				break;
			case 2:
				while (true) {
					long cardNumber = inputCardNumber(scanner);
					scanner.nextLine();
					String cardHolder = inputCardHolder(scanner);
					int pin = setUpPin(scanner);
					paymentMethod = new DebitCard(cardNumber, cardHolder, pin);
					if (paymentMethod.validatePaymentDetails()) {
						paymentMethod.processPayment();
						break;
					}
					System.out.println("Enter Valid Details...");
				}
				break;
			case 3:
				while (true) {
					String upiId = inputUpi(scanner);
					int pin = setUpPin(scanner);
					paymentMethod = new Upi(upiId, pin);
					if (paymentMethod.validatePaymentDetails()) {
						paymentMethod.processPayment();
						break;
					}
					System.out.println("Enter Valid Details....");
				}
				break;
			case 4:
				while (true) {
					String email = inputEmail(scanner);
					int pin = setUpPin(scanner);
					paymentMethod = new PayPal(email, pin);
					if (paymentMethod.validatePaymentDetails()) {
						paymentMethod.processPayment();
						break;
					}
					System.out.println("Please Enter Valid Details....");
				}
				break;
			case 5:
				System.out.println("Exiting...");
				loop = false;
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}

	}

	public static String inputEmail(Scanner scanner) {
		System.out.print("Enter Your Paypal Email: ");
		return scanner.nextLine();
	}

	public static String inputUpi(Scanner scanner) {
		System.out.print("Enter UPI ID: ");
		return scanner.nextLine();
	}

	public static int setUpPin(Scanner scanner) {
		System.out.print("Set Your Pin: ");
		return scanner.nextInt();
	}

	public static String inputCardHolder(Scanner scanner) {
		System.out.print("Enter Card Holder Name: ");
		return scanner.nextLine();
	}

	public static long inputCardNumber(Scanner scanner) {

		System.out.print("Enter Card Number: ");
		return scanner.nextLong();
	}

}
