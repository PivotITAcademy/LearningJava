package polymorphismExample;

public class PolyMain {

	public static void main(String[] args) {

		PolyMorph poly = new PolyMorph();

		System.out.println(poly.addNumbers(3, 4));

		System.out.println(poly.addNumbers(3, 4, 5));

		poly.addNumbers(1, 2);
		
		poly.addNumbers(1.5, 5);
		
		String address = "100Queen St";
				
		address.substring(0, 0);

	}

}
