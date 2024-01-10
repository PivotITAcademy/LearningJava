package staticExample;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		Calculator.calculate("Add", 10, 20);

		Calculator calc1 = new Calculator();
		Calculator.setValueOfPi(3.1415);
		System.out.println(Calculator.valueOfPi);
		calc.printSomething();
		calc1.printSomething();
		
	}

}
