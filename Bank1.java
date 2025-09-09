package runTimePolymorphismBank;
//Write a program for Run time polymorphism and in runner class perform up casting
//1.Bank - getRateOfInterest , deposit(), withdraw()
//SBI extends Bank - getRateOfInterest, deposit(), withdraw()
//ICICI Bank extends Bank - getRateOfInterest, deposit(), withdraw()
//Axis Bank extends Bank - getRateOfInterest, deposit(), withdraw()

//run time polymorphism = method overriding
//up casting = class casting
public class Bank1 {

	protected String typeOfBank = "Public Sector Bank";
	public double getRateOfInterest() {
		return 880008d;
	}
	
	public int deposit() {
		return 5000;
	}
	
	protected float withdraw() {
		return 57050.7f;
	}
}
