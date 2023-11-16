package comparisonOperators;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CalculateFuelInjection calculateFuelInjection = new CalculateFuelInjection();
//		//Intialize the variables == assigning values to the variable
//		calculateFuelInjection.xThrottle = -256;
//		
//		calculateFuelInjection.calculateFuelInjection();
		
		CopyOfCalculateFuelInjection copyOfCalculateFuelInjection = new CopyOfCalculateFuelInjection();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x-throttle in console");
		
		copyOfCalculateFuelInjection.xThrottle=sc.nextInt();
		
		
		
		copyOfCalculateFuelInjection.calculateFuelInjection();
	}

}
