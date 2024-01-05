package abstractionExample2;

public class RevenueCalcMain {

	public static void main(String[] args) {

		ClientEngagement cibc = new ClientEngagement("CIBC", 40, 100000);
		ClientEngagement macD = new ClientEngagement("MacD", 35, 120000);

		ClientEngagement walmart = new ClientEngagement("Walmart", 50, 150000);

		RevCalcuator cal = null;

//		double hourlyRevenue = cal.calculateRev(cibc);
//		System.out.println("The Hourly revenue is: " + hourlyRevenue);
//
//		cal = new MonthlyBase();
//		double monthlyRevenue = cal.calculateRev(macD);
//		System.out.println("The Monthly revenue is: " + monthlyRevenue);
//
//		cal = new RoyaltyBase();
//		double dividendRevenue = cal.calculateRev(walmart);
//		System.out.println("The Dividend is: " + dividendRevenue);

		RevenueGenerator revGen = new RevenueGenerator();

		revGen.printRevenue(walmart, new HourlyBase());
		
		

	}

}
