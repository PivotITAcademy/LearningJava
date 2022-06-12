package classesExamples;

import java.util.Scanner;

public class NameChangeProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person neetu = new Person();
		neetu.firstName = "Neetu";
		neetu.lastName ="Singh";
		
		Scanner sc = new Scanner(System.in);
		String changedLastName ="";
		
		System.out.println("neetu got married and wants to change her last name");
		
		System.out.println("\n Neetu's surname before marriage to : "+neetu.lastName);
		
//		System.out.println("Enter the last name you want to change");
	
//		 
//		String enteredLastName = sc.next();
//		  
//		  
//		changedLastName = neetu.changeLastName(enteredLastName);
		
//		System.out.println(change "\n Neetu's surname changed to : "+changedLastName);
		
		System.out.println("\n Neetu's surname After marriage to : "+neetu.lastName);
		
		System.out.println("Enter the new age");
		int changedAge = sc.nextInt();
		
		int updatedAge = neetu.updatedAge(changedAge);
		
		System.out.println("Age updated to : "+updatedAge);
		
		neetu.age = 101;
		
		System.out.println("Age changed using variable : "+neetu.lastName);
		
//		Person laxmi = new Person();
//		laxmi.firstName = "Laxmi";
//		laxmi.lastName = "Mariappan";
//		
//		Person salinder = new Person();
//		salinder.firstName = "Salinder";
//		salinder.lastName ="Poswal";
//		
//		
//		System.out.println("Laxmi got married and wants to change her last name");
//		
//		System.out.println("\n Laxmi's surname before marriage to : "+laxmi.lastName);
//		
//		 changedLastName = "mariopol";
//		
//		System.out.println("\n Laxmi surname changed to : "+laxmi.changeLastName());
//		
//		System.out.println("\n Laxmi surname After marriage to : "+laxmi.changeLastName());
//		
//		
//		System.out.println("Salinder got married and wants to change her last name");
//		
//		System.out.println("\n Salinder surname before marriage to : "+salinder.lastName);
//		
//		 changedLastName = salinder.changeLastName();
//		
//		System.out.println("\n salinder surname changed to : "+changedLastName);
//		
//		System.out.println("\n salinder surname After marriage to : "+salinder.lastName);
		
	}

}
