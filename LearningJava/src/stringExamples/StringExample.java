package stringExamples;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Shijo";

		
		String name1 = new String("Shijo");

		// == compares memory location
		if (name == name1) {

			System.out.println(" Line 14 : Joseph will answer the question");
		}
		
		//.equals() method compares values 
		if(name.equals(name1)) {
			System.out.println("Line 18 : Joseph will answer the question");
		}

		// toCharArray

		char[] charInName = name.toCharArray();

		System.out.println(charInName.length);

		// Replace
		name = name.replace("Sh", "R");

		System.out.println("new name :" + name);

		//
		String sentence = "Shijo knows Rijo who doesn't know Jijo";

		sentence = sentence.replaceAll("jo", "mo");

		System.out.println(sentence);

		// Contains
		System.out.println("Whether the sentence contains who :" + sentence.contains("who"));

		// charAt()
		System.out.println(sentence.charAt(1));
		// indexOf
		System.out.println("Index of ' " + sentence.indexOf("'"));

		System.out.println("Index of ' " + sentence.indexOf("knows"));

		String palindrome = "ARORA";

		// Check if ARORA is palindrome

		StringBuffer b = new StringBuffer("abd");

		if (palindrome.equals(b.reverse().toString())) {
			System.out.println("String is palindrome");
		}

		//Out of all students present in class check if Jerin is present in the class
		
		
		// Substring method
		String message = "Welcome to Africa";
		
		
		String country = message.substring(message.indexOf("Africa"));
		
		System.out.println("Country : "+country);
		
		System.out.println(message.substring(message.indexOf("to"),10));
		
		
		//split
		
		System.out.println(Arrays.toString(message.split("\s")));
		
		String csvString = "Shijo,Joseph,25";
		
		String[] csvValues = csvString.split(",");
		
		System.out.println(Arrays.toString(csvValues));
		
		System.out.println("firstName : "+csvValues[0] +"  lastName : "+csvValues[1] + "   age : "+csvValues[2]);
		
		
	}

}
