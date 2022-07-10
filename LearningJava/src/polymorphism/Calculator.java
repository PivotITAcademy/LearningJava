package polymorphism;

public class Calculator {

	
	// Method Overloading or Compile time polymorphism
	
	public static int addNumbers(int a, int b) {
		return a + b;
	}

	public static double addNumbers(double a, double b) {
		return a + b;
	}
	
	
	public static int addNumbers(int a, int b, int c) {
		return a+b +c;
	}

	public static int addNumbers(int a, int b, int c, int d) {
		return a+b +c+d;
	}
	
	
	
}
