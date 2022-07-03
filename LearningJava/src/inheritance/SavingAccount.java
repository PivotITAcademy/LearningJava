package inheritance;

public class SavingAccount extends Account{

	private int pin;
	
	public SavingAccount(){
		System.out.println("In SavingAccount sub class constructor");
	}

	public SavingAccount(int pin) {
		this.pin = pin;
		System.out.println("In SavingAccount sub class parameterized constructor");
	}
	
	
}
