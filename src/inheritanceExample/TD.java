package inheritanceExample;

public class TD extends BankOfCanada {

	public TD() {
		System.out.println("TD COnstructor");
	}

	public void issueLOCForRRSP() {
		System.out.println("TD offers LOC for RRSP contribution");
	}

	@Override
	public double getInterestRate() {
		return interestRate - 1.75;
	}

}
