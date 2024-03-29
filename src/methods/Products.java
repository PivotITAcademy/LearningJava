package methods;

import java.util.Scanner;

public class Products {

	String[] samsungProducts = { "S20", "S21", "Flip", "Fold" };

	
	String[][] quantityofSamsungProducts = { {"S20","30"}, {"S21","35"},{"Flip","10"},{"Fold","15"}};
	
	
	String[] appleProducts = { "Iphone12", "Iphone SE", "Iphone 13", "Iphone 15" };

	String[] googleProducts;

	Scanner sc = new Scanner(System.in);
	
	ArrayUtilityClass arrayUtilClass = new ArrayUtilityClass();

	String brand;
	String selectedProduct=null;

	// Display the products
	 void displayProducts() {

		boolean isValidBrandSelected = false;
		
		boolean isValidProductSelected = false;

		while (!isValidBrandSelected) {

			System.out.println("Enter the brandName Samsung or Apple ");
			//Calling the nextLine() method Of scanner class - Calling method from another class or Invoking a method from another class
			
			brand = sc.nextLine();
			

			if (brand.equalsIgnoreCase("Samsung")) {
				isValidBrandSelected = true;
				System.out.println("Products available for " + brand);
				//printArray(samsungProducts);
				arrayUtilClass.printArray(samsungProducts);
				
				
				
				isValidProductSelected = arrayUtilClass.checkProductExists(samsungProducts);
				
			} else if (brand.equalsIgnoreCase("apple")) {
				isValidBrandSelected = true;
				arrayUtilClass.printArray(appleProducts);
				checkProductExists();
			} else {

				System.out.println("Brand not available");
			}
			
			if (isValidProductSelected) {
				System.out.println(  "product exist in the list ");
			}
		}
	}

	// Check the product exist or not
	private void checkProductExists() {

		boolean isValidProductSelected = false;
		
		while (!isValidProductSelected) {
			System.out.println("Select  a product");
			selectedProduct = sc.nextLine();

			if (brand.equalsIgnoreCase("Samsung")) {
				for (int i = 0; i < samsungProducts.length; i++) {
					
					String s= samsungProducts[i];
					if (s.equalsIgnoreCase(selectedProduct)) {
						isValidProductSelected = true;
						break;
					}
				}
			} else if (brand.equalsIgnoreCase("Apple")) {
				for (int i = 0; i < appleProducts.length; i++) {
					if (appleProducts[i].equalsIgnoreCase(selectedProduct)) {
						isValidProductSelected = true;
						break;
					}
				}
			}
		}
		

	}
	
	
	
	Product checkIfinStock() {
		
		boolean inStock=false;
		
		Product selectedPrdct = new Product("", 0, "");
		selectedPrdct.name=selectedProduct;
		
		for(int i=0;i<samsungProducts.length;i++) {
			if(quantityofSamsungProducts[i][0].equalsIgnoreCase(selectedProduct)) {
				if(Integer.valueOf(quantityofSamsungProducts[i][1])>0) {
					selectedPrdct.quantity=Integer.valueOf(quantityofSamsungProducts[i][1]);
					selectedPrdct.inStock=true;
					
				}
			}
		}
		 
		return selectedPrdct;
		
	}
	
	void addToCart() {
		
		Product product = checkIfinStock();
		boolean inStock = product.inStock;
		System.out.println(product.name + "is in stock : "+inStock+" and no of quantity available :"+product.quantity);
		System.out.println("Go ahead and add the product to cart");
		//Code for ading to cart
	}
	
	
	
}
