package inheritance;

public class BankMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChequingAccount chqAccount = new ChequingAccount();
		chqAccount.depositMoney(1000);
		
		SavingAccount svngAccount = new SavingAccount();
		
		TFSA tfsa = new TFSA();
		tfsa.depositMoney(5000);
		
		
		System.out.println("Balance in chequing : "+chqAccount.balance);
		
		System.out.println("Balance in Saving : "+svngAccount.balance);
		
		System.out.println("Balance in TFSA : "+tfsa.balance);
	}

}
