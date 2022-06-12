package classesExamples;

import java.util.Scanner;

public class Person {

	String firstName;
	String lastName;
	int age;


	String changeLastName(String newLastName) {

		lastName = newLastName;

		return lastName;
	}

	int updatedAge(int newAge) {

		if (newAge < 100) {
			
			age = newAge;

		}
		return age;
	}

}
