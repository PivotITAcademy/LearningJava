package comparisonOperators;

public class OROperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isDebitCardAvailable = false;
		
		boolean isCreditCardAvailable = false;
		
		//Check if eitheer of my conditions are true - we user OR operator denoted by || 
		boolean canShop = isDebitCardAvailable || isCreditCardAvailable;
		
		System.out.println("Can ishop :"+canShop);
	}

}
