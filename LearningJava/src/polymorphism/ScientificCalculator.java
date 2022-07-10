package polymorphism;

public class ScientificCalculator extends Calculator {
	
	String name;
	
	public ScientificCalculator  returnObject() {
		return  new ScientificCalculator();
	}
	
	//Upcasting is casting it to parent
	
	public Calculator returnObject( String name) {
		return new LogCalculator();
	}
	
	// Accessmodifier Return type methodname (argument)
	
	public double add(int a, int b) {
		return 12;
	}
	
	
}
