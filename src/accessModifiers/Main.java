package accessModifiers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		account.accountNumber="798799877";
		account.atmPin=1234;
		
		Hacker hacker = new Hacker();
		hacker.hack(account);
		
		System.out.println("Enter pin");
		
		int pin =sc.nextInt();
		
		account.checkPin(pin);
		
	}

}
