package operators;

public class ArithematicOperators {

	int num1, num2;
	double num3;
	
	void divide() {
		int quotient =num1/num2;
		int remainder = num1%num2;
		System.out.println("Quotient is "+quotient);
		System.out.println("Remainder is : "+remainder);
	}
	
	void division() {
		
		double quotient = num1/num2;
		System.out.println("Quotient with decimal value : "+quotient);
	}
}
