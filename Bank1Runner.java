package runTimePolymorphismBank;
//UP-CASTING 
public class Bank1Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank1 sbi = new SBI1();
		System.out.println("rate of getting interest:" + sbi.getRateOfInterest());
		System.out.println("deposits in sbi bank:" + sbi.deposit());
		System.out.println("withdraw in sbi bank:" + sbi.withdraw());
		System.out.println("type of sbi bank is:" + sbi.typeOfBank);
		
		System.out.println("==========================================================================");
		Bank1 icici = new ICICI1("Private Sector Bank");
		System.out.println("rate of getting interest:" + icici.getRateOfInterest());
		System.out.println("deposits in icici bank:" + icici.deposit());
		System.out.println("withdraw in icici bank:" + icici.withdraw());
		System.out.println("type of icici bank is:" + icici.typeOfBank);
		
		System.out.println("==========================================================================");
		Bank1 axis = new Axis1("Private Sector BAnk");
		System.out.println("rate of getting interest:" + axis.getRateOfInterest());
		System.out.println("deposits in axis bank:" + axis.deposit());
		System.out.println("withdraw in axis bank:" + axis.withdraw());
		System.out.println("type of axis bank is:" + axis.typeOfBank);
		
	}

}
