package abstraction;

public class TD extends BankRules {

	@Override
	public void captureUserDetails() {
		// TODO Auto-generated method stub
			System.out.println("Capturing information using eform");
	}
	
	public void captureUserDetails(String sinNumber) {
		// TODO Auto-generated method stub
			System.out.println("Capturing information using sinnumber");
	}

}
