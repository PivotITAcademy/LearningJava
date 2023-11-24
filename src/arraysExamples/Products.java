package arraysExamples;

import java.util.Scanner;

public class Products {

	String[] products = { "Laptop", "Phone", "Powerbank", "Headphones", "Earphones", "Mouse", "Charger", "LaptopStands",
			"Keyboard", "HDMIcable" };
	Scanner sc = new Scanner(System.in);
	
	

	void findProductExists() {

		System.out.println("Enter the product you want to buy");
		String item = sc.next();

		boolean itemFound = false;

		// Iterate over the array
		for (int i = 0; i < products.length; i++) {

			if (products[i].equalsIgnoreCase(item)) {

				itemFound = true;
				break;

			}

		}

		if (itemFound) {
			System.out.println("Found the item : " + item + " in the product list");
		} else {
			System.out.println("Item not found in the product list");
		}

	}

}
