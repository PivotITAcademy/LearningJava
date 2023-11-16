package comparisonOperators;

public class SimpleIfElseExample {

	
	int age;
	
	void checkIfThePersonIsAdult() {
		
		//Result of a comparison is always boolean 
		/*
		Comparison	Result
		100==100	true
		100==101	false
		100!=100	false
		200!=201	true
		200>=100	true
		255889=<300000	True

		True == false	false
		*/
		
		//BODMAS
		boolean areTwoExpressionEquals = 3+2==4+1;
		
		

		boolean isAdult = age>18; //On RHS we 
	

		//if condition
		if(true) {
			System.out.println("Person is adult");
		}
		else {
			System.out.println("Person is not an adult");
		}
	}
}
