package dynamicInput;

import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args) {

		double balance = 1000;

		double withdrawAmount = 0;

		// To get value at runtime
		// Read from console
		Scanner sc = new Scanner(System.in);

		// To read an int value
		// int age = sc.nextInt();

		System.out.println("Enter the amount you want to withdraw");

		withdrawAmount = sc.nextDouble();

		// To read string value from console
		String promoCode = sc.next();

		if (withdrawAmount < balance) {
			System.out.println("Amount withdrawn : " + withdrawAmount);
			System.out.println("Balance in account : " + (balance - withdrawAmount));
		} else {
			System.out.println("Not sufficient balance");
		}

	}

}
