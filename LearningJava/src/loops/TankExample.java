package loops;

public class TankExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fill in a 100 litre tank using 10 lit bucket. Create a mechanism to avoid
		 * overflow.
		 */

		int maxCapacity = 100;//final , constant

		int bucketCapacity = 10;//final

		int currentCapacity = 91; // Assuming initial volume in tank

		while (currentCapacity < maxCapacity) {
					
			if(currentCapacity>=90) {				
				break;
			}else {
				currentCapacity = currentCapacity + bucketCapacity;
			}
			
			
			
		}
		
		System.out.println("Current capacity :"+currentCapacity);

	}

}
