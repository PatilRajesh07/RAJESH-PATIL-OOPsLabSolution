package com.greatlearning.CredentialService;

public class GenerateEmailAddress {
	GeneratePassword generatePassword = new GeneratePassword();

	public void technical(String firstName, String lastName) {
		System.out.println();
		System.out.println("Dear " + firstName.toUpperCase() + " Your Generated Credentials Are As Follows :");
		System.out.println("Email    : " + firstName.toLowerCase() + lastName.toLowerCase() + "@tech.greatlearning.com");
		System.out.println("Password : " + generatePassword.generatePassword());
	}

	public void admin(String firstName, String lastName) {
		System.out.println();
		System.out.println("Dear " + firstName.toUpperCase() + " Your Generated Credentials Are As Follows :");
		System.out.println("Email    : " + firstName.toLowerCase() + lastName.toLowerCase() + "@admin.greatlearning.com");
		System.out.println("Password : " + generatePassword.generatePassword());
	}

	public void humanResource(String firstName, String lastName) {
		System.out.println();
		System.out.println("Dear " + firstName.toUpperCase() + " Your Generated Credentials Are As Follows :");
		System.out.println("Email    : " + firstName.toLowerCase() + lastName.toLowerCase() + "@hr.greatlearning.com");
		System.out.println("Password : " + generatePassword.generatePassword());
	}

	public void legal(String firstName, String lastName) {
		System.out.println();
		System.out.println("Dear " + firstName.toUpperCase() + " Your Generated Credentials Are As Follows :");
		System.out.println("Email    : " + firstName.toLowerCase() + lastName.toLowerCase() + "@legal.greatlearning.com");
		System.out.println("Password : " + generatePassword.generatePassword());
	}

	public void exit() {
		System.out.println();
		System.out.println("Happy Learning !");
	}

}
