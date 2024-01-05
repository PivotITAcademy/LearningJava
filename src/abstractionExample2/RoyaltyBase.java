package abstractionExample2;

public class RoyaltyBase extends RevCalcuator{

	private double dividend = 0.15;
	
	@Override
	public double calculateRev(ClientEngagement engagement) {
		// TODO Auto-generated method stub
		return engagement.getAnticipatedRevenue()*dividend;
	}
	
	

}
