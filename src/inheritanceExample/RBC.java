package inheritanceExample;

public class RBC extends BankOfCanada {

	public RBC() {
		System.out.println("RBC Constructor");
	}

	public void provideRewardsProram() {
		System.out.println("RBC provides Rewards Program");
	}

	@Override
	public double getInterestRate() {
		return interestRate - 1.5;
	}

}
