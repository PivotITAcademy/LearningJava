package abstractionExample2;

public class ClientEngagement {

	private String clientName;
	private int hoursWorked;
	private double anticipatedRevenue;

	public ClientEngagement(String clientName, int hoursWorked, double anticipatedRevenue) {

		this.clientName = clientName;
		this.hoursWorked = hoursWorked;
		this.anticipatedRevenue = anticipatedRevenue;
	}

	public String getClientName() {
		return clientName;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getAnticipatedRevenue() {
		return anticipatedRevenue;
	}

}
