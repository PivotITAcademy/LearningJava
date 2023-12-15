package inheritanceExample;

public class InheritanceMain {

	public static void main(String[] args) {

		RBC rbc = new RBC();
		TD td = new TD();

		BankOfCanada boc = new BankOfCanada();

		rbc.issueCreditCard();
		rbc.provideRewardsProram();

		td.issueLOCForRRSP();
		td.openBankAcct();

		boc.issueCreditCard();

		RBCWealth rbcWealth = new RBCWealth();

		rbcWealth.openInvestAcct();
		rbcWealth.provideRewardsProram();
		rbcWealth.openBankAcct();

	}

}
