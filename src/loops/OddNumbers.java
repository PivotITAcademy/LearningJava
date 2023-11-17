package loops;

public class OddNumbers {
	
	void printOddNumbers() {
		
		for(int i=1;i<20;i+=2) {
			
			System.out.println(" odd numbers: "+i);
		}
	}
	
	void printOddNUmbersWayTwo() {
		
		int num =1;
		//i is counter - how many times the loop gets executed
		for(int i=0;i<10;i++) {
			
			System.out.println(" odd numbers 2nd way: "+num);
			num+=2;//How i get my next odd number
			
		}
	}

}
