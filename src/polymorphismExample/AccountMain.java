package polymorphismExample;

public class AccountMain {

	public static void main(String[] args) {

		AccountDetails account = new AccountDetails("4567890", 4567, "admin", "Admin123");

		String modeOfUse = "Online";
		boolean isValidUser = false;
//		if (modeOfUse.equals("ATM")) {
//			isValidUser = account.validateUser("1234567", 1234);
//		} else if (modeOfUse.equals("Online")) {
//			isValidUser = account.validateUser("admin", "Admin123");
//		}

		isValidUser = modeOfUse.equals("ATM") ? account.validateUser("1234567", 1234)
				: account.validateUser("admin", "Admin123");

		System.out.println("Is User Validated: " + isValidUser);
	}

}
