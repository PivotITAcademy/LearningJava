package conditionalStatementsExamples;

public class IfElseExample {

	public static void main(String[] args) {

		/*
		 * if(condition is  true){
		 *    do something - take action
		 * }else{
		 *   otherwise something else
		 * }
		 */
		
		//if seats are available in flight then book the ticket -
		//Book 5 tickets/seats if seats are available
		
//		int totalSeats = 500;
//		
//		int seatsBooked = 200;
//		
//		
//		int ticketsNeeded = 301;
//		
//		if(ticketsNeeded < (totalSeats - seatsBooked)) {
//			//if block
//			System.out.println("Booking accepted");
//			System.out.println("you can travel");
//			//Code for booking ticket
//		}else {
//			//else block
//			System.out.println("Booking rejected due to seats not available");
//			System.out.println("You cannot travel");
//		}
		
		
		// if  else if else
		
		boolean isTeaAvailable = false;
		
		boolean isCoffeeAvailable = false;
		
		if(isTeaAvailable) {
			
			System.out.println("Let's have tea");
		}else if( isCoffeeAvailable) {
			System.out.println("Please have coffee ");
		}else {
			System.out.println("Sorry no drink to offer");
		}
		
		int creditScore = 600;
//		
		if(creditScore >750) {
			System.out.println("eligible");
		}else if(600<=creditScore  &&  creditScore< 750) {
			System.out.println("B lender provide loan");
		}else {
			System.out.println("sorry cannot get loan ");
		}
//		int income = 50000;
//		
//		if(income>40000 && income < 50000) {
//			System.out.println("tax rate 10 %");
//		}else if(income>50000 && income < 70000) {
//			System.out.println("Tax rate 15 %");
//		}else if(income>75000 && income < 100000) {
//			System.out.println("Tax rate 20 %");
//		}else {
//			System.out.println("Tax rate is 33%");
//		}
			
		

	}

}
