package Account;

public class VehicleLoanAccount extends Account {

	public void loanDetails(int emiForVehicle, double interest) {
		System.out.println("for 2 years this much interest will be there:" + interest);
		System.out.println("EMI per month will be:" + emiForVehicle);
	}
}
