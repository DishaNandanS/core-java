package Account;

public class CurrentAccount extends Account{

	int interest;
	String interestName;
	
	public void currentInfo() {
		System.out.println(interest);
		System.out.println(interestName);
		
		interest=78;
		interestName="BussinessPlan";
		System.out.println(this.interest);
		System.out.println(this.interestName);
	}
}
