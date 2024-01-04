package abstractionExample2;

public class ClientManagement {

	private String clientName;
	private int hoursWorked;
	private double anticipatedRevenue;

	public ClientManagement(String clientName, int hoursWorked, double anticipatedRevenue) {

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
