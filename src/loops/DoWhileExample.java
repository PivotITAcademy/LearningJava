package loops;

import java.util.Scanner;

public class DoWhileExample {

	int noOfChoclates;

	boolean isSnowingHeavily;
	boolean isMomCallingBack;
	Scanner sc = new Scanner(System.in);
	
	void trickAndTreating() {

		do {
			
			System.out.println("Go to Next house");
			System.out.println("Trick or Treat");
			System.out.println("Is it snowing ");
			isSnowingHeavily = sc.nextBoolean();
			if(isSnowingHeavily) {
				break;
			}
			noOfChoclates++;
			System.out.println("Total Choclates"+noOfChoclates);

		} while (noOfChoclates < 10);
		
		System.out.println("No of choclates collected : "+noOfChoclates);
	}
	
	
}
