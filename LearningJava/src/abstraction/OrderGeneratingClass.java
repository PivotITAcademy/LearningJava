package abstraction;

public class OrderGeneratingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PaymentMethod method = new CreditCard();
		
		method.confirmPayment();
		
	}

}
