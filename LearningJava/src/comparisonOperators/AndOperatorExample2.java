package comparisonOperators;

public class AndOperatorExample2 {

	public static void main(String[] args) {
		// User name and password match

		// abc@gmail.com
		
		String userName = "abc12@gmail.com";
		
		String enteredUserName = "abc@gmail.com";
		
		String password = "abcd";
		
		String enterPassword = "abcd";
		
		//String Comparison 
		boolean isUserNameSame = userName.equals(enteredUserName);
		
		
		boolean isPasswordSame = password.equals(enterPassword);
		
		boolean isAbleToLogin = isUserNameSame && isPasswordSame;
		
		System.out.println("User is able to login :"+isAbleToLogin);
	}

}
