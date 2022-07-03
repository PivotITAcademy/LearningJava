package inheritance;

public class Account {

	String name;
	
	String address;
	
	

	String sinNumber;
	
	String phoneNumber;
	
	double balance; 
	
	private int pin;
	 
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Account(String name, String address, String sinNumber, String phoneNumber, double balance) {
		super();
		this.name = name;
		this.address = address;
		this.sinNumber = sinNumber;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void depositMoney(double amount) {
		
		
		balance = balance +amount;
		
	}
	
	public void withdrawMoney(double amount) {
		
		balance = balance - amount;
				
	}
	
	
	public boolean authorization(int pin, String account) {
		
		switch(account){
		
		case  "Chequing": 
			if(pin ==1234) {
				return true;
			}
			break;
			
		case "Saving" : 
			if(pin ==3456) {
				return true;
			}
			break;
			
		case "TFSA":
			if(pin ==6666) {
				return true;
			}
			break;
			
			
		}
		
		return false;
		
	}
}
