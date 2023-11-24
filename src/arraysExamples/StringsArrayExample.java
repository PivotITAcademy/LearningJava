package arraysExamples;

import java.util.Scanner;

public class StringsArrayExample {

	String[] names = new String[5];
	
	Scanner sc = new Scanner(System.in);
	
	void populateTheArray() {
		
		for(int i=0;i<names.length;i++) {
			
			System.out.println("Enter name");
			names[i]=sc.next();
		}
	}
	
	
}
