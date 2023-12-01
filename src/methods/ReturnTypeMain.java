package methods;

public class ReturnTypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodReturnTypeExample methodReturnTypeExample = new MethodReturnTypeExample();
		
		methodReturnTypeExample.i=9.99;
		methodReturnTypeExample.j=12;
		
		double sumOfTwoNumbers = methodReturnTypeExample.sum();
		
		System.out.println("Sum of two variables is : "+sumOfTwoNumbers);

	}

}
