package comparisonOperators;

public class CalculateFuelInjection {

	int xThrottle,yFuel;
	
	void calculateFuelInjection() {
		
		//boolean isxlessThan127 = xThrottle<=127;
		
		//if(condition/comparison){ code that will be executed when the result of condition is true}
		
	
		if(xThrottle>0 && xThrottle<=127) {
			yFuel = xThrottle*2;	
			System.out.println("yFuel value is :"+yFuel);
		}
		else if(xThrottle>=128 && xThrottle<=255){
			yFuel = xThrottle+127;
			System.out.println("yFuel value is :"+yFuel);
		}
		else {
			System.out.println(" X-throttle should be between 1 to 255");
		}
		
		
		
	}
}
