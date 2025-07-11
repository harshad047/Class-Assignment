package com.tss.test;

import com.tss.model.InputValidator;
import java.util.Scanner;

public class InputValidatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username, password, email;

		while (true) {
			System.out.print("Enter username: ");
			username = sc.nextLine();
			if (InputValidator.validateUsername(username)) {
				System.out.println("Username is valid.");
				break;
			}
			System.out.println("Invalid username.");

		}

		while (true) {
			System.out.print("Enter password: ");
			password = sc.nextLine();
			if (InputValidator.validatePassword(password)) {
				System.out.println("Password is valid.");
				break;
			}
			System.out.println("Invalid password.");

		}

		while (true) {
			System.out.print("Enter email: ");
			email = sc.nextLine();
			if (InputValidator.validateEmail(email)) {
				System.out.println("Email is valid.");
				break;
			}
			System.out.println("Invalid email.");

		}

		sc.close();
	}
}
