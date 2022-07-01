package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public char[] generatePassword() {

		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numb = "0123456789";
		String specialCharac= "!@#$%^&*_=+-/.?<>)";

		String values = capLetters + smallLetters + numb + specialCharac;
	
		// Using random method
		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".Greatlearning.com";
	}
	
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email --> "+ email);
		System.out.print("Password --> 1" 				+ "");
		System.out.print(generatedPassword);
	}
	
}
