package conditionalStatementsExamples;

public class IfelseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount =1000;
		int accountBalance = 500;
		
		if(amount<accountBalance) {
			
			System.out.println("You can withdraw : "+amount);
		}else {
			System.out.println("Balance is less than the amount to be withdrawn");
		}
	}

}
