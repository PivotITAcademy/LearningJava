package abstractionExample2;

public class RevenueGenerator {

	public void printRevenue(ClientEngagement engagement, RevCalcuator calc) {

		double revenue = calc.calculateRev(engagement);
		System.out.println("Revenue with " + engagement.getClientName() + " is " + revenue);
	}

}
