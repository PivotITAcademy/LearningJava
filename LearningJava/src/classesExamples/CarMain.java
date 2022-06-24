package classesExamples;

import java.util.Scanner;



public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create n number of cars using Car class

		// Instantiate an object , create an object , create an instance of a class
		// Object = instance = variable
		// honda is atype of car - honda is a variable of type car
		Car honda = new Car();

		Car toyota = new Car();

		Car rangeRover = new Car();

		int num;

		String[] names = new String[10];

		names[1] = "Ketaki";

		//System.out.println(names[1]);

		// System.out.println(num);

		num = 5;

	//	System.out.println(num);

		// object.variableName
		// instance.variableName

//		System.out.println("Honda Model :" + honda.model);
//
//		System.out.println("Honda Make year : " + honda.makeYear);
//
//		System.out.println("Honda Transmission : " + honda.transmission);
//		System.out.println("Honda Color : " + honda.color);
//		System.out.println("Honda engine : " + honda.engine);

		// Assigning values to variables of a class

		String name;
		name = "neetu";

		name = "athira";

		// Assign values to variables of honda object

		honda.model = "civic";
		honda.makeYear = 2020;
		honda.transmission = "manual";
		honda.color = "white";
		honda.engine = "gas";

//		System.out.println("Honda Model :" + honda.model);
//
//		System.out.println("Honda Make year : " + honda.makeYear);
//
//		System.out.println("Honda Transmission : " + honda.transmission);
//		System.out.println("Honda Color : " + honda.color);
//		System.out.println("Honda engine : " + honda.engine);

		//System.out.println("Toyota model : " + toyota.model);
		
		// Call the method - use the method - invoke the method
		//Use the methods to drive the car 
		
	//	honda.startTheCar();
		int returnedSpeed = honda.increasingSpeed();
		//speed = sc.nextInt()
		System.out.println("Speed is increased to :"+returnedSpeed);
		
		System.out.println("Value of speed variable in honda obj : "+honda.speed);
		
//		if(returnedSpeed==40) {
//			System.out.println("Speed increased to desired value");
//		}else if(returnedSpeed>80) {
//			System.out.println("Braking system will fail");
//		}
//		else {
//			System.out.println("Speeding mechanism failed");
//		}
		
		//If speed goes above 80 braking system will fail
		
		boolean isBrakeApplied = honda.applyBrakes();
		System.out.println("Brakes applied :"+isBrakeApplied);

	}

}
