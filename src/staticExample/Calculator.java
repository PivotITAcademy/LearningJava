package staticExample;

public class Calculator {

	public static double valueOfPi = 3.14;
	
	public static int calculate(String operation, int num1, int num2) {
		switch (operation) {
		case "Add":
			return num1 + num2;
		case "Subtract":
			return num1 - num2;
		default:
			return 0;
			
		}
	}

	public static void setValueOfPi(double valueOfPi) {
		Calculator.valueOfPi = valueOfPi;
		calculate("Subtract", 10, 20);
	}
	
	public void printSomething() {
		System.out.println("This is a non static method");
		setValueOfPi(3.14157);
	}
	
	public static int calculate(String operation, int num1, int num2, int num3) {
		switch (operation) {
		case "Add":
			return num1 + num2+num3;
		case "Subtract":
			return num1 - num2;
		default:
			return 0;
			
		}
	}

}
