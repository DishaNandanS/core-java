package Account;

public class SavingsAccount extends Account{

	private long revenue;
	private boolean safety;
	
	public SavingsAccount() {
	}
	public SavingsAccount(long revenue, boolean safety) {
		this.revenue=revenue;
		this.safety=safety;
	}
	public void savingsDetails() {
		System.out.println("revenue:" + revenue);
		System.out.println("privacy:" + safety);
	}
}
