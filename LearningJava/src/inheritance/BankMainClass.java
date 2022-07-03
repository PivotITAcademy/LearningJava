package inheritance;

public class BankMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChequingAccount chqAccount = new  ChequingAccount("ketaki", "brampton","898976","98797879",1000,12, 100);
		chqAccount.depositMoney(1000);
				
		SavingAccount svngAccount = new SavingAccount(1234);
		
		TFSA tfsa = new TFSA();                    
		tfsa.depositMoney(5000);
		
		
//		System.out.println("Balance in chequing : "+chqAccount.balance);
//		
//		System.out.println("Balance in Saving : "+svngAccount.balance);
//		
//		System.out.println("Balance in TFSA : "+tfsa.balance);
	}

}
