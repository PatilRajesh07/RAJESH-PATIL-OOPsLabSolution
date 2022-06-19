package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.CredentialService.GenerateEmailAddress;
import com.greatlearning.models.Employee;

public class DriverClass {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		GenerateEmailAddress generateEmailAddress1 = new GenerateEmailAddress();

		Scanner sc = new Scanner(System.in);
		String firstName;
		String lastName;

		System.out.println("Welcome to the Great Learnings.");
		System.out.println();

		System.out.println("Enter Your First Name :");
		firstName = sc.nextLine();

		System.out.println("Enter Your Last Name :");
		lastName = sc.nextLine();

		employee1.setfirstName(firstName);
		employee1.setlastName(lastName);
		int option;

		do {
			System.out.println();
			System.out.println("Please Enter The Department From The Following :");
			System.out.println(" 1. : Technical");
			System.out.println(" 2. : Admin");
			System.out.println(" 3. : Human Resource");
			System.out.println(" 4. : Legal");
			System.out.println(" 0. : Exit");
			option = sc.nextInt();

			switch (option) {
			case 0: {
				generateEmailAddress1.exit();
				break;
			}

			case 1: {
				generateEmailAddress1.technical(employee1.getfirstName(), employee1.getlastName());
			}
				break;
			case 2: {
				generateEmailAddress1.admin(employee1.getfirstName(), employee1.getlastName());
			}
				break;
			case 3: {
				generateEmailAddress1.humanResource(employee1.getfirstName(), employee1.getlastName());
			}
				break;
			case 4: {
				generateEmailAddress1.legal(employee1.getfirstName(), employee1.getlastName());
			}
				break;

			default:
				System.out.println("Enter Valid Option");
			}

		} while (option != 0);
	}
}
