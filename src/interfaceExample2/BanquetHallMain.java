package interfaceExample2;

import java.util.Scanner;

public class BanquetHallMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the hall you want to select");

		String hallName = sc.next();

		BanquetHall hall = null;

		switch (hallName) {
		case "Blossom":
			hall = new Blossom();
			break;
		case "Harmony":
			hall = new Harmony();
			break;
		default:
			System.out.println("Unknown Hall Name");;
		}

		hall.provideBookingServices();
		hall.provideSeatingArrangement();
	}

}
