package amusementPark;

public class Car {

	//Attributes - variable
	 String model;
	 int makeYear;
	 String engine;
	 String color;
	 String transmission;
	 int speed;
	 
	//Methods
	 //drive
	 //applyBrakes
	 //playMusic
	 
	  // Define a method 
	 
	 //returnType methodname(input arg){ //method body}
	 

	 boolean applyBrakes() {
		 
		 System.out.println("press the brake");
		 
		 if(speed>80) {
			 return false;
		 }else {
			 System.out.println("speed reduced");
			 System.out.println("car stops");
		 }
		 return true;
	 }
	 
	 void startTheCar() {
		 System.out.println("turn on ignition");
	 }
	 
	 int increasingSpeed() {
		 
		 System.out.println("Increase the speed");
		int speed= 79;
		 return speed;
	 }
	 
	 //tell me the color of car
	  String getColor() {
		  
		return color;
		  
	  }
	  
	  void parkTheCar() {
		  System.out.println("Car is parked ");
	  }
	  	 
	  void canOwn() {
		  System.out.println("Car Owned ");
	  }
	 
}
