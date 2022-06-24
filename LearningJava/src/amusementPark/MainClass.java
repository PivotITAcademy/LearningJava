package amusementPark;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Roller coaster
		AmusementParkRide rollerCoaster = new AmusementParkRide();
		// Water slides
		AmusementParkRide slides = new AmusementParkRide();

		boolean isEligibleToRide = false;

		//Assigning the value while creating the object
		Person joseph = new Person(92,16);
//		joseph.height = 92;
//		joseph.weight = 16;

		//Creating an object first and then assigning the value
		Person salinder = new Person();
		salinder.height = 100;
		salinder.weight = 50;
		
		Person rintu = new Person();
		rintu.height = 100;
		rintu.weight = 50;
		
		

//		chintu.postToInsta(rollerCoaster.parkName);
//		//Check eligiblity of Joseph for rollerCoaster

		isEligibleToRide = rollerCoaster.checkEligibilty(joseph.height, joseph.weight);

		System.out.println("Eligible to ride ");
		
		
		
		Car jCar = new Car();
		jCar.parkTheCar();
		Car josephCar = joseph.haveCar();
		josephCar.parkTheCar();

	}

}
