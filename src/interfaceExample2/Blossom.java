package interfaceExample2;

public class Blossom implements BanquetHall {

	public Blossom() {
//		capacity = 400;
	}

	@Override
	public void provideSeatingArrangement() {
		System.out.println("Blossom Has a capacity of 500 Occupants");

	}

	@Override
	public void provideBookingServices() {
		System.out.println("Blossom has online booking services");

	}

	@Override
	public void provideFood() {
		System.out.println("Blossom provides buffet");

	}

	@Override
	public void provideDrinks() {
		System.out.println("Blossom has a bar");

	}

	@Override
	public double getPriceOfHall() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
