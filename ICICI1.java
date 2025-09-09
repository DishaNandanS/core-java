package runTimePolymorphismBank;

public class ICICI1 extends Bank1 {

	public ICICI1() {
		
	}
	public ICICI1(String typeOfBank) {
		this.typeOfBank=typeOfBank;
	}
	public double getRateOfInterest() {
		return 67998;
	}
	public int deposit() {
		return 123;
	}
	protected float withdraw() {
		return 3657.9f;
	}
}
