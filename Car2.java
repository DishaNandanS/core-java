package Vehicle2;

public class Car2 extends Vehicle2 {

	public String carColor;
	
	public Car2() {
		
	}
	public Car2(String name, int wheels, String carColor) {
		super(name, wheels);
		this.carColor=carColor;
	}
	public void details() {
		System.out.println("name:" +name);
		System.out.println("wheels:" +wheels);
		System.out.println("color:" +carColor);
	}
}
