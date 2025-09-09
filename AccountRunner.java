package Account;

public class AccountRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomeLoanAccount home = new HomeLoanAccount();
		home.loanDetails(770000d, 3);
		
		VehicleLoanAccount vehi = new VehicleLoanAccount();
		vehi.loanDetails(5000, 450000d);
		
		Account acc = new Account();
		acc.loanDetails(4, "Karnataka Bank", 35000d);
	}

}
