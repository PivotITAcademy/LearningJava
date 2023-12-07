package methods;

//This class represents a single product
public class Product {

	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + ", brand=" + brand + "]";
	}

	String name;

	int quantity;

	String brand;
	
	boolean inStock;

	public Product(String name, int quantity, String brand) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
	}

//	boolean isInStock() {
//
//		if (quantity > 0) {
//			return true;
//		} else {
//
//			return false;
//		}
//	}

}
