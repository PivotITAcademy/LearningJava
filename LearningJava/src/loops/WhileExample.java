package loops;

public class WhileExample {

	public static void main(String[] args) {

		// Print first 100 whole numbers - 1 to 100
		// counter

		int number = 11;
		
		int stopNumber = 4;

		//Repeat till the condition is true - we use while loop
		//initial value, condition, increment
		
		//Stop the printing at value of stopNumber without changing the limit
		
		while (number <= 10) {

			System.out.println(number);

			number++;
			
			if(number==stopNumber) {
				break;
			}
			
		}
		
		
	}

}
