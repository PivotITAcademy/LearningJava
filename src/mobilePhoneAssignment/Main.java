package mobilePhoneAssignment;

import java.util.Arrays;
import java.util.Scanner;

import methods.Product;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DataType[] arrayName = new DataType[length];
		//Array of objects
		Product[] productArray = new Product[4];
		
		Product s20 = new Product("S20", 30, "Samsung");
		productArray[0]= s20;
		
		
		Product s21 = new Product("S21", 25, "Samsung");
		productArray[1]= s21;
		
		Product pixel = new Product("GooglePixel", 25, "Google");
		productArray[2]=pixel;
		
		Product iphone15 = new Product("Iphone15", 30, "Apple");
		productArray[3]=iphone15;
		
		
		for(int i=0;i<productArray.length;i++) {
			
			System.out.println(productArray[i].toString());
		}
		
		
		
		//Print All the models associated to a brand
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a brand name from Samsung, Google, Apple");
		String brandName = sc.nextLine();
		
		System.out.println("Models available for "+brandName +" are as below :");
		
		
		
		for(int i=0;i<productArray.length;i++) {
			
			//Storing object at ith index in variable productObject
			Product productObject = productArray[i];
			
			String name = productObject.printModels(brandName);
			
			if(name!=null) {
				System.out.println(name);
			}
		}
		
		
		
	}

}
