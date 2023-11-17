package loops;

public class ForLoopExample {

	int noOfChoclates;
	
	//print the next 10 numbers
	void printConsecutive10Numbers() {
		
		//Syntax of for loop //for(int i=0;i<5;i++)
		//(initialize counter; checkcondition; increment counter)
		for(int hno=0;
			hno<5;
			hno++) {
			
			System.out.println(noOfChoclates++);
			
			
		}
	}
	
}
