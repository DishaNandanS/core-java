package runTimePolymorphismBank;

public class Axis1 extends Bank1{

	public Axis1() {
		
	}
	public Axis1(String typeOfBank) {
		this.typeOfBank=typeOfBank;
	}
	public double getRateOfInterest() {
		return 119087d;
	}
	public int deposit() {
		return 6500;
	}
	protected float withdraw() {
		return 2388.9f;
	}
}
