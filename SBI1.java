package runTimePolymorphismBank;

public class SBI1 extends Bank1{

	public SBI1() {
		
	}
	public SBI1(String typeOfBank) {
		this.typeOfBank=typeOfBank;
	}
	public double getRateOfInterest() {
		return 99009;
	}
	public int deposit() {
		return 400;
	}
	public float withdraw() {
		return 3989.7f;
	}
}
