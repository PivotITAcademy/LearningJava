package accessModifiers;

public class BankAccount {

	public String name;

	String accountNumber;

	double balance;

	private int atmPin;

	public BankAccount(String name, String accountNumber, double balance, int atmPin) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.atmPin = atmPin;
	}

	void checkPin(int pin) {

		if (pin == atmPin) {
			System.out.println("User validate successfully");
		} else {
			System.out.println("incorrect pin");
		}
	}
}
