package inheritanceDay2;

import java.util.Scanner;

public class MacDonaldsMain1 {

	public static void main(String[] args) {

		MacDonalds macDonalds = new MacDonalds();
		macDonalds.provideBurgers();
		System.out.println("Which country you want to select");
		Scanner sc = new Scanner(System.in);

		String countryOfChoice = sc.next();
//		if (countryOfChoice.equals("India")) {
//			macDonalds = new MacDonaldsIndia();
//		} else if (countryOfChoice.equals("China")) {
//			macDonalds = new MacDonaldsChina();
//		}
		macDonalds = countryOfChoice.equals("India") ? new MacDonaldsIndia()
				: countryOfChoice.equals("China") ? new MacDonaldsChina() : null;
		macDonalds.provideBurgers();

//		macDonalds.provideSamosa();
		MacDonaldsIndia macDIndia = new MacDonaldsIndia();
		MacDonaldsIndia macDIndia2 = (MacDonaldsIndia) macDonalds;

		String name = "Swaroop";
		String name1 = "Ketaki";

	}

}
