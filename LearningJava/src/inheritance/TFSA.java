package inheritance;

public class TFSA extends Account{

	double limit;
	
	public TFSA() {
		// TODO Auto-generated constructor stub
		System.out.println("In TFSA sub class constructor");
	}
	
	//Method Overriding  
	//@Override - it is an annotation which indicates a method is overidden
	
	@Override 
	public void depositMoney(double amount) {
		
		if(balance+amount< limit) {
			balance = balance +limit;
		}
	}
		
}
