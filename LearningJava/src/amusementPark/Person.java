package amusementPark;

public class Person {

	int height;
	int weight;
	int age;
	
	//Constructor do not have a return type
	//Constructor have the same name as Class - No arg constructor
	Person(){
		
	}
//	
//	//Parameterized constructor
	Person(int h, int w){
		height = h;
		weight =w;
	}
//	
//	Person(int h, int w, int a){
//		height = h;
//		weight=w;
//		age=a;
//	}
	Car haveCar() {
		//Object of car - it an object of type Car
		//binding a car to a person
		
		Car car1 = new Car();
		return car1;
	}
	
}
