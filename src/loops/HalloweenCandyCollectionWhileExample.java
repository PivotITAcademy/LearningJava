package loops;

public class HalloweenCandyCollectionWhileExample {

	int noOfChoclates;

	void trickAndTreating() {

		while (noOfChoclates < 10) {

			System.out.println("Trick or Treat");
			noOfChoclates++;
			if (noOfChoclates != 10) {
				System.out.println("Go to next house");
			}

		}

		
		do {
			
		}while(noOfChoclates<10);
	}

}
