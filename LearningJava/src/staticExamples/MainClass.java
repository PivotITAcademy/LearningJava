package staticExamples;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		State massa = new State();
		massa.stateCapital ="Boston";
		State.countryCapital = "Washington DC";
		
		System.out.println("State Capital :"+ massa.stateCapital);
		System.out.println("Country Capital :"+ State.countryCapital);
		
		State newyork =new State();
		newyork.stateCapital = "newyork";
		State.countryCapital ="newyork";
		
		
		System.out.println("State Capital :"+ newyork.stateCapital);
		System.out.println("Country Capital :"+ State.countryCapital);
		
		State california = new State();
		california.stateCapital ="LA";
		
		System.out.println("State Capital :"+ california.stateCapital);
		System.out.println("Country Capital :"+ california.countryCapital);
		
		System.out.println("State Capital :"+ massa.stateCapital);
		System.out.println("Country Capital :"+ massa.countryCapital);
		
		//WindowsSoftware ppt = new WindowsSoftware();
		WindowsSoftware.method();
		
		CurrentDateTIme.currentDate();
		
		int result = Math.addExact(2, 4);
		
		
	
		
	}

}
