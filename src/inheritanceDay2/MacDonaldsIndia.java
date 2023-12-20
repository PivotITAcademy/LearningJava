package inheritanceDay2;

public class MacDonaldsIndia extends MacDonalds {

	@Override
	public void provideBurgers() {
		System.out.println("Provide Veggie Burgers");
	}

	public void provideSamosa() {
		System.out.println("Provide Samosa as starters");
	}

}
