package abstractClassExample;

public abstract class Shape {
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public String shapeName;

	public abstract double calculateArea();
	
	public static void printShape() {
		System.out.println("This is : ");
	}

}
