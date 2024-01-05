package abstractionExample2;

public class HourlyBase extends RevCalcuator{

	private double hourlyRate = 45;
	
	@Override
	public double calculateRev(ClientEngagement engagement) {
		// TODO Auto-generated method stub
		return engagement.getHoursWorked()*hourlyRate;
	}
	
	

}
