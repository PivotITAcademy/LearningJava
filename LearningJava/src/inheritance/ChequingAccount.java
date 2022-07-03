package inheritance;

public class ChequingAccount extends Account{

	double chequingAccountMinBalance;
	int noOfTransactions;
	
	public ChequingAccount(String name, String address, String sinNumber, String phoneNumber, double balance, int not, double bal) {
		// TODO Auto-generated constructor stub
		
		super(name, address, sinNumber, phoneNumber, balance);
		System.out.println("In ChequingAccount sub class constructor");
		
		this.chequingAccountMinBalance = bal;
		this.noOfTransactions = not;
	}
	
}
