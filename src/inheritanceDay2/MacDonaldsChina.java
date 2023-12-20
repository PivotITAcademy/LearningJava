package inheritanceDay2;

public class MacDonaldsChina extends MacDonalds {

	@Override
	public void provideBurgers() {
		System.out.println("Provide fish burgers");
	}

	@Override
	public void provideFries() {
		System.out.println("Provide Schezwan Fries to the customer");
	}

}
