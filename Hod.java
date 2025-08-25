package College;

public class Hod extends Department{

	private String HodName;
	private int noOfLabs;
	
	public Hod() {}
	public Hod(String HodName, int noOfLabs, double fees, boolean isGoodCollege) {
		this.HodName=HodName;
		this.noOfLabs=noOfLabs;
		this.fees=fees;
		this.isGoodCollege=isGoodCollege;
		
	}
	
	public void hodInfo() {
		System.out.println("name:" + HodName);
		System.out.println("labs:" + noOfLabs);
		System.out.println("fees:" + fees);
		System.out.println("goodCollege:" + isGoodCollege);
	}
}

