package methods;

import java.util.Scanner;

public class ArrayUtilityClass {

	Scanner sc = new Scanner(System.in);
	
	void method() {
		
	}

	public void printArray(String[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	String[] populateArray() {

		System.out.println("Enter the no of elements in the array");

		int length = sc.nextInt();

		String[] array = new String[length];

		// Run the for loop

		System.out.println("Enter the value to be put at index");

		return array;

	}

	boolean checkProductExists(String[] prdtArray) {

		boolean isValidProductSelected = false;

		while (!isValidProductSelected) {

			System.out.println("Select  a product");
			String selectedProduct = sc.nextLine();
			
			for (int i = 0; i < prdtArray.length; i++) {
				if (prdtArray[i].equalsIgnoreCase(selectedProduct)) {
					isValidProductSelected = true;
					break;
				}
			}
			
		}

		return isValidProductSelected;
	}

}
