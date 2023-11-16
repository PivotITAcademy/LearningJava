package operators;

public class Person {

	String name;
	int age;
	double savings;
	
	void increaseTheAgeBy1() {
		//age = age+1;
		
		//age+=100;
		
		age++;
		
	
	}
	
	void decreaseTheValueBy1() {
		//age--;
		age-=1;
	}
	
	void calculateInterestOnSaving() {
		//saving = saving *1.1;
		//saving = 3000*1.1;
		savings*=1.1;
	}
}
