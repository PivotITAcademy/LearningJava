package comparisonOperators;

public class PartyEntryCheck {

	int age;
	boolean isAccompaniedByAdult;
	
	void allowinTheparty() {
		
		if(age>18||isAccompaniedByAdult) {
			
			System.out.println("Entrance granted");
		}else {
			System.out.println("Entrance not granted");
		}
	}
}
