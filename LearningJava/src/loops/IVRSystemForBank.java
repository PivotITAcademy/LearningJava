package loops;

import java.util.Scanner;

public class IVRSystemForBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String option = "";

		double balance = 500;

		double creditCardBalance = 2000;

		Scanner sc = new Scanner(System.in);

		String s1 = "one";

		String s2 = "One";

		System.out.println("Enter the option in lowercase ");

		option = sc.next();

		// Switch case statement - Read your option - it executes only that code which
		// is associated to that option
		// 1 - Show Account balance
		// 2- Show type of accounts - Saving and chequing
		// 3 - creditcardbalance

		switch (option) {

		case "one": {
			System.out.println("Account balance = " + balance);
			break;
		}

		case "two":
			System.out.println("Types of account : " + "\n Saving \n Chequing");
			break;

		case "three":
			System.out.println("Credit card balance :" + creditCardBalance);
			break;

		case "four": {
			// calculating the interest monthly and annual
			System.out.println("Calculating monthly and annual interest");
			break;
		}
		default:
			System.out.println("Enter a valid input");

		}

	}
}
