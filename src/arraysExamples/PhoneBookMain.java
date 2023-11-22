package arraysExamples;

import java.util.Arrays;

public class PhoneBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneBook phoneBook = new PhoneBook();
		
		phoneBook.populateTheArray();
		
		phoneBook.printTheArray();
		
		int n =12;
		
	//	System.out.println("value of n : "+n);
		
		System.out.println("Array rep provide by Arrays class : \n"+ Arrays.toString(phoneBook.phoneNumbers));
	}

}
