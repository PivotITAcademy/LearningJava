package inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike bike = new Bike();
		bike.engineCapacity = 100;
		bike.noOfTyres=2;
		
		Car car = new Car();
		
		car.engineCapacity = 1000;
		car.noOfTyres =4;
		
		Truck truck = new Truck();
		truck.engineCapacity = 5000;
		truck.noOfTyres = 8;
				
	}

}
