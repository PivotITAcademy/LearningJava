package abstractClassExample;

public class Square extends Shape {

	private double sideLength;
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
		shapeName = "Square";
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return sideLength*sideLength;
	}

}
