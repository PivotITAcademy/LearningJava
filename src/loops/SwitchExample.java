package loops;

import java.util.Scanner;

public class SwitchExample {

	int num1, num2;

	double result;

	Scanner sc = new Scanner(System.in);

	String operation = "";

	void performOperation() {

		System.out.println("Enter the operation you want to perform \n"  
				+" add - for addition, subtract- for substraction");
		
		operation  = sc.next();
		
		switch (operation) {

		case "add":
			result = num1 + num2;
			break;

		case "subtract":
			result = num1 - num2;
			break;
			
		default: System.out.println("Unsupported operation");
		}

		System.out.println("result : "+result);
	}
	
	
	void performOperationUsingNumericInputs() {

		System.out.println("Enter the operation you want to perform \n"  
				+" 1 - for addition, 2- for substraction");
		
		int opr  = sc.nextInt();
		
		switch (opr) {

		case 1:
			result = num1 + num2;
			break;

		case 2:
			result = num1 - num2;
			break;
			
		default: System.out.println("Unsupported operation");
		}

		System.out.println("result : "+result);
	}
}
