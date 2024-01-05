package abstractionExample2;

public class RevenueCalculator {

	private double hourlyRate = 45;
	private double monthlyRate = 3500;
	private double dividend = 0.15;

	public double calculateIncome(String methodOfEngagment, ClientEngagement engagement) {
		double totalRevenue = 0;
		switch (methodOfEngagment) {
		case "Hourly":
			totalRevenue = hourlyRate * engagement.getHoursWorked();
			break;
		case "Fixed":
			totalRevenue = monthlyRate;
			break;
		case "Royalty":
			totalRevenue = dividend * engagement.getAnticipatedRevenue();
			break;

		default:
			System.out.println("Invalid Method of Engagement");
		}
		return totalRevenue;
	}

}
