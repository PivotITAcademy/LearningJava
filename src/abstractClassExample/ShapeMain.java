package abstractClassExample;

public class ShapeMain {

	public static void main(String[] args) {

		Circle circle = new Circle(10.5);
		Square square = new Square(10);
		Rectangle rectangle = new Rectangle(4, 5);

		System.out.println("Circle Area: " + circle.calculateArea());

		System.out.println("Square Area: " + square.calculateArea());

		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		
		

	}

}
