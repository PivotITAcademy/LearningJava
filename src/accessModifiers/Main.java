package accessModifiers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ketakiAccount = new BankAccount("Ketaki","09908097",500.44,1234);
		Scanner sc = new Scanner(System.in);
		
//		ketakiAccount.accountNumber="798799877";
//		ketakiAccount.balance=500;
//		ketakiAccount.name="ketaki";
		

		
		Hacker hacker = new Hacker();
		hacker.hack(ketakiAccount);
		
		System.out.println("Enter pin");
		
		int pin =sc.nextInt();
		
		ketakiAccount.checkPin(pin);
		
	}

}
