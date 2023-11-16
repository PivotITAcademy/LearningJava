package operators;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person parul = new Person();
		parul.age=16;
		System.out.println("Parul age : "+parul.age);
		
		System.out.println("It's parul's bday, increase her age by 1");
		
		parul.increaseTheAgeBy1();
		
		System.out.println("Parul age : "+parul.age);
		
		parul.savings=3000;
		
		parul.calculateInterestOnSaving();
		
		System.out.println("saving in parul account : "+parul.savings);
		
	}

}
