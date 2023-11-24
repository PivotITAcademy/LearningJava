package arraysExamples;

import java.util.Scanner;

public class UserInfo {

	String[][] users = { { "pivot@gmail.com", "abcue12" }, { "riya@gmail.com", "sss@12" },
			{ "lal@gmail.com", "ath@12" } };
	Scanner sc = new Scanner(System.in);

	void populateUsers() {

		for (int i = 0; i < users.length; i++) {

			for (int j = 0; j < users[i].length; j++) {

				users[i][j] = sc.next();

			}

		}
	}

	void findUser() {

		System.out.println("Enter the username");

		String userName = sc.next();

		boolean userFound = false;

		int indexOfUser = -1;

		String password = "";

		for (int i = 0; i < users.length; i++) {

			for (int j = 0; j < users[i].length; j++) {
				
				if (users[i][j].equalsIgnoreCase(userName)) {
					
					userFound = true;
					indexOfUser = i;
					password = users[i][1];
					break;

				}

			}
		}

		if (userFound) {

			System.out.println(
					" User : " + userName + " found at index : [" + indexOfUser + "][0] & password is " + password);
		} else {
			System.out.println("user not found");
		}

	}

}
