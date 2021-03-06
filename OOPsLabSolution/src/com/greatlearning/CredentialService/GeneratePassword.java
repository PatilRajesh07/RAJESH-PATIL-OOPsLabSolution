package com.greatlearning.CredentialService;

import java.util.Random;

public class GeneratePassword {

	public char[] generatePassword() {

		int length = 10;
		String symbol = "-/.^&*_!@%=+>)";
		String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";

		String finalString = capLetter + smallLetter + numbers + symbol;

		Random random = new Random();

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			password[i] = finalString.charAt(random.nextInt(finalString.length()));
		}
		return password;
	}
}