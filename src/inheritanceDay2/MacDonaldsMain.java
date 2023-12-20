package inheritanceDay2;

public class MacDonaldsMain {

	public static void main(String[] args) {

		MacDonalds macD = new MacDonalds();

		macD.provideBurgers();
		macD.provideFries();

		MacDonaldsIndia macDIndia = new MacDonaldsIndia();

		macDIndia.provideBurgers();
		macDIndia.provideFries();

		MacDonaldsChina macDChina = new MacDonaldsChina();

		macDChina.provideBurgers();

		macDChina.provideFries();

	}

}
