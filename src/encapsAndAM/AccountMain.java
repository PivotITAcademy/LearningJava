package encapsAndAM;

public class AccountMain {

	public static void main(String[] args) {

		Account ravneetAcct = new Account("789012345", 4567.58, 1234);

		System.out.println("Ravneet Account Details: " + ravneetAcct.getAccountDetails(1234));
		
		ravneetAcct.setPin(456, 1234, "789012346");
		System.out.println(" ");
	}

}
