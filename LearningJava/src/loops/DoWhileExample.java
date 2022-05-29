package loops;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		int number = 0;
		
		int stopNumber = 0;

		//Repeat till the condition is true - we use while loop
		//initial value, condition, increment
		//Question : Stop the loop at the number provided by user
		
		System.out.println("Enter value of number where you want to stop the loop");
		
		Scanner sc = new Scanner(System.in);

		stopNumber = sc.nextInt();
		
		
		
		do {
				number++;
				System.out.println(number);				
		}while(number<stopNumber);
	}

}
