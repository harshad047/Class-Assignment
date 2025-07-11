package com.tss.model;

public class InputValidator {

	public static boolean validateUsername(String username) {
		if (isValidLength(username, 3, 20)) {
			return true;
		}
		return false;
	}

	public static boolean validatePassword(String password) {
		if (isValidLength(password, 8, 30)) {
			return true;
		}
		return false;
	}

	public static boolean validateEmail(String email) {
		if (isValidLength(email, 5, 50) && containsEmailCharacters(email)) {
			return true;
		}
		return false;
	}

	private static boolean isValidLength(String input, int min, int max) {
		if (input != null && !input.isEmpty() && input.length() >= min && input.length() <= max) {
			return true;
		}
		return false;
	}

	private static boolean containsEmailCharacters(String email) {
		return email.contains("@") && email.contains(".");
	}
}
