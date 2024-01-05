package abstractionExample2;

public class MonthlyBase extends RevCalcuator{

	private double monthlyRate = 3500;
	
	@Override
	public double calculateRev(ClientEngagement engagement) {
		// TODO Auto-generated method stub
		return monthlyRate;
	}
	
	

}
