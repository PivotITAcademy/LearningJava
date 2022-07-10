package classesExamples;

import accessModifiers.Account;
import accessModifiers.Phone;

public class ExternalMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		account.name = "Ketaki";
		
		//account.usePin();
		
		Phone phone = new Phone();
		phone.phoneNmber = "8623876";
		
		Person person = new Person();
		person.phoneNumber ="98739812";
		
		
	}

}
