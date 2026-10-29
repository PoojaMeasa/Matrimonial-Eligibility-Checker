package com.consolebasedprojects;

import java.util.Scanner;

public class MatrimonialApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Name: ");
		String name = sc.nextLine();
		System.out.println("Hello Mr " + name + " Nice to meet you");

		System.out.println("Please Enter the Assert: ");
		double asert = sc.nextDouble();

		System.out.println("Please Enter the Salary: ");
		double sal = sc.nextDouble();

		if (asert >= 50000000 && sal >= 2500000) {
			System.out.println("Oh Great to know!! Lets Continue the Discussion");

			System.out.println("Enter the Age: ");
			int age = sc.nextInt();

			if (age >= 26 && age <= 30) {
				System.out.println("Oh Great to know!! Lets Continue the Discussion");

				System.out.println("Enter the height: ");
				float height = sc.nextFloat();

				if (height >= 5.7f && height <= 6.1f) {
					System.out.println("Oh Great to know!! Lets Continue the Discussion");

					System.out.println("Enter the weight: ");
					float weight = sc.nextFloat();

					if (weight >= 65 && weight <= 75) {
						System.out.println("Oh Great to know!! Lets Continue the Discussion");
						
						System.out.println("Do you have Siblings");
						boolean sib = sc.nextBoolean();
						
						
						if(!sib) {
							System.out.println("Okay!!!! we will get back to you");
						}else {
							System.out.println("OMG! Let's stop this");
						}
					}else {
						System.out.println("Sorry your weight is not matching");
					}
				}else {
					System.out.println("Sorry your height is not matching");
				}
			} else {
				System.out.println("Sorry your Age is not matching");
			}
		} else {
			System.out.println("Okay! you can leave for the day");
		}
	}

}
