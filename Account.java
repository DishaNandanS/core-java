package Account;
//Write a program for run time polymorphism
//create class Account , HomeLoanAccount , VehilceLoanAccount
public class Account {

	public void loanDetails(int noOfAccounts, String bankName, double interest ) {
		System.out.println("for 2 years this much interest will be there:" + interest);
		System.out.println("BAnk namw will be:" + bankName);
		System.out.println("Total number of accounts:" + noOfAccounts);
	}
}
