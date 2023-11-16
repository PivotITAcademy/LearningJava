package firstProgram;

public class MainClass {

	// Main Method - Program execution starts from main. Starting point of Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object creation - Create a copy from the template
		// Syntax - ClassName objectName = new ClassName();
		MobilePhone samsungPhone = new MobilePhone();

		MobilePhone applePhone = new MobilePhone();

		MobilePhone googlePhone = new MobilePhone();
		
		//Assigning a value to variable
		samsungPhone.brand = "Samsung";
		samsungPhone.color ="Black";
		
		applePhone.brand = "Apple";
		
		googlePhone.brand = "Google";
		
		//Invoke a method
		samsungPhone.makeCall();
		
		

	}

}
