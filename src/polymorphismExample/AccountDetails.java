package polymorphismExample;

public class AccountDetails {

	private String accountNum;
	private int pin;
	private String userName;
	private String password;

	public AccountDetails(String accountNum, int pin, String userName, String password) {
		super();
		this.accountNum = accountNum;
		this.pin = pin;
		this.userName = userName;
		this.password = password;
	}

	private int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	private String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String getAccountNum() {
		return accountNum;
	}

	public boolean validateUser(String accountNum, int pin) {
		if (accountNum.equals(getAccountNum()) && pin == getPin()) {
			return true;
		}
		return false;
	}

	public boolean validateUser(String userName, String password) {
		if (userName.equals(getUserName()) && password.equals(getPassword())) {
			return true;
		}
		return false;
	}

	
}
