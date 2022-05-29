package loops;

import java.util.Scanner;

public class RealWorldDoWhileExample {

	public static void main(String[] args) {

		/*
		 * User should be allowed to attempt sign in only 3 times, if he fails to enter
		 * it correct for 3 times then block the logging for whole day if he provides
		 * the correct information the first time then he should be able to sign in
		 * successfully.
		 */

		String email = "";
		String password = "";

		String expectedUserName = "test@gmail.com";
		String expectedPassword = "Test@123";

		Scanner sc = new Scanner(System.in);

		int maxAllowedNoOfAttempts = 3;

		int noOfAttemptsMade = 0;

		do {
			System.out.println("Enter username");
			email = sc.next();

			System.out.println("Enter password");
			password = sc.next();

			
			
			if (email.equals(expectedUserName) && password.equals(expectedPassword)) {
				System.out.println("Sign in successful");
				break;
			}

			if (noOfAttemptsMade <maxAllowedNoOfAttempts) {
				System.out.println("Check in your credentials and Enter it again ");
				noOfAttemptsMade++;

			}

			

		} while (noOfAttemptsMade < maxAllowedNoOfAttempts);

		if (noOfAttemptsMade == maxAllowedNoOfAttempts) {
			System.out.println("Profile locked");
		}

	}

}
