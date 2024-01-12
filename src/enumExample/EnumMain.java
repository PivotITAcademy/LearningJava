package enumExample;

import java.util.Scanner;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Flight airCanadaEconomy = new Flight(1000, SeatType.ECONOMY);
		Flight airCanadaBusiness = new Flight(3000, SeatType.BUSINESS);

		System.out.println("Enter the seat you want to book");
		String seatEntered = sc.next();
		SeatType seatType = null;
		switch (seatEntered) {
		case "Economy":
			seatType = SeatType.ECONOMY;
			break;

		case "Business":
			seatType = SeatType.BUSINESS;

		default:
			System.out.println("No such seat");
		}
		System.out.println("Seat Selected: " + seatType.getName());
		System.out.println("Number of seats in the flight " + seatType.getNumOfSeats());

	}

}
