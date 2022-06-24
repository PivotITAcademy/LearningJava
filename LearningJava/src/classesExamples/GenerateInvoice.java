package classesExamples;

import java.util.Scanner;

public class GenerateInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Product[] selectedProducts =  new Product[3];
		Scanner sc = new Scanner(System.in);
		Invoice invoice = new Invoice();
		
		double invoiceTotal =0;
		
		selectedProducts[0] = new Product("Milk",5.45,"Organic",1);
		selectedProducts[1] = new Product("Bread",2.0,"Whole wheat",2);
		selectedProducts[2] = new Product("Butter",5.45,"Organic",2);
		
		
		invoiceTotal = invoice.calculateInvoiceTotal(selectedProducts);
		
		//Print the invoice total with tax
	}

}
