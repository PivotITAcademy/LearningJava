package amusementPark;

public class AmusementParkRide {

	 String parkName = "Wonderland";

	// Perform the function of checking the eligibility to ride
	boolean checkEligibilty(int height,int weight) {
		// Logic to check height and weight

		if ((height > 90 && height < 200) && (weight > 15 && weight < 95)) {
			return true; //return statement
		} else {
			return false;
		}
	}
}
