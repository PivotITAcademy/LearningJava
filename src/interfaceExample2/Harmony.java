package interfaceExample2;

public class Harmony implements BanquetHall {

	@Override
	public void provideSeatingArrangement() {
		System.out.println("Harmony Has a capacity of 200 Occupants");

	}

	@Override
	public void provideBookingServices() {
		System.out.println("Harmony has only in person booking services");

	}

	@Override
	public void provideFood() {
		System.out.println("Harmony provides high tea");

	}

	@Override
	public void provideDrinks() {
		System.out.println("Harmony only serves non alcoholic drinks");

	}

	@Override
	public double getPriceOfHall() {
		// TODO Auto-generated method stub
		return 500;
	}

}
