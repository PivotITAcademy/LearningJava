package classesExamples;

import java.util.Random;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] selectedProducts =  new Product[3];
		Scanner sc = new Scanner(System.in);
		
		
		selectedProducts[0] = new Product("Milk",5.45,"Organic");
		selectedProducts[1] = new Product("Bread",2.35,"Whole wheat");
		selectedProducts[2] = new Product("Butter",5.45,"Organic");
		
		for(int i =0;i<selectedProducts.length;i++) {
			
			System.out.println(selectedProducts[i].name);
			
		}
		

	}

}
