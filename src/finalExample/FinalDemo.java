package finalExample;

public class FinalDemo {

	public final double pi = 3.14;

//	public FinalDemo(double pi) {
////		this.pi = pi;
//	}

	public double getvalueOfPi() {
		return pi;
	}

//	public void setValueOfPi(double pi) {
//		this.pi=pi;
//	}

	
	public final void printValueOfPI() {
		System.out.println("The value of PI is :"+pi);
	}
}
