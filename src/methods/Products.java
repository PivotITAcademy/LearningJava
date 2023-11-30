package methods;

import java.util.Scanner;

public class Products {

	String[] samsungProducts = { "S20", "S21", "Flip", "Fold" };

	String[] appleProducts = { "Iphone12", "Iphone SE", "Iphone 13", "Iphone 15" };

	String[] googleProducts;

	Scanner sc = new Scanner(System.in);

	String brand;

	// Display the products
	void displayProducts() {

		boolean isValidBrandSelected = false;

		while (!isValidBrandSelected) {

			System.out.println("Enter the brandName Samsung or Apple ");
			brand = sc.nextLine();

			if (brand.equalsIgnoreCase("Samsung")) {
				System.out.println("Products available for " + brand);
				for (int i = 0; i < samsungProducts.length; i++) {
					System.out.println(samsungProducts[i]);
					isValidBrandSelected = true;

				}
			} else if (brand.equalsIgnoreCase("apple")) {
				for (int i = 0; i < appleProducts.length; i++) {
					System.out.println("Products available for " + brand);
					System.out.println(appleProducts[i]);
					isValidBrandSelected = true;

				}
			} else {

				System.out.println("Brand not available");
			}

		}
	}

	// Check the product exist or not
	void checkProductExists() {

		System.out.println("Select  a product");
		String selectedProduct = sc.nextLine();

		boolean isValidProductSelected = false;

		if (brand.equalsIgnoreCase("Samsung")) {
			for (int i = 0; i < samsungProducts.length; i++) {
				if (samsungProducts[i].equalsIgnoreCase(selectedProduct)) {
					isValidProductSelected = true;
				}
			}
		}else if(brand.equalsIgnoreCase("Apple")) {
			for (int i = 0; i < appleProducts.length; i++) {
				if (appleProducts[i].equalsIgnoreCase(selectedProduct)) {
					isValidProductSelected = true;
				}
			}
		}
			
		if (isValidProductSelected) {
			System.out.println(selectedProduct + " exist in the list ");
		}

	}
}
