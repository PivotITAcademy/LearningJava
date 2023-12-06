package accessModifiers;

public class BankAccount {

	public String name;
	
	String accountNumber;
	
	double balance;
	
	private int atmPin;
	
	void checkPin(int pin) {
		
		if(pin==atmPin) {
			System.out.println("User validate successfully");
		}else {
			System.out.println("incorrect pin");
		}
	}
}
