package encapsAndAM;

public class Account {

	private String accountNum;
	private double balance;
	private int pin;

	public Account(String acctNum, double bal, int pin) {
		accountNum = acctNum;
		balance = bal;
		this.pin = pin;
	}

	private String getAcctNum() {
		return accountNum;
	}

	private double getBalance() {
		return balance;
	}

	private int getPIN() {
		return pin;
	}

	public String getAccountDetails(int pinEntered) {
		if (pinEntered == pin) {
			return getAcctNum() + " " + getBalance();
		}
		return "Incorrect PIN";
	}

	public void setPin(int newPin, int oldPin, String acctNum) {
		if (oldPin == this.pin && acctNum.equals(this.accountNum)) {
			if (Integer.toString(newPin).toCharArray().length == 4) {
				this.pin = newPin;
			} else {
				System.out.println("PIN should always be 4 digits");
			}
		} else {
			System.out.println("PIN/ Account Number is not correct");
		}
	}
}
