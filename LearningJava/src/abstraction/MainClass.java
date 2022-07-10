package abstraction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		CreditRules creditRules = new Equifax();
		
		creditRules.provideCreditSummary();
		
		BankRules bank = new BMO();
		bank.captureUserDetails();
		
		//Reference variable of Interface or abstract class - which is a parent of my class
		
		
		
	}

}
