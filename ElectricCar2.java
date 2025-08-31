package Vehicle2;

public class ElectricCar2 extends Car2{

	float batteryPower;
	
	public ElectricCar2() {
		
	}
	public ElectricCar2(String name, int wheels, String carColor, float batteryPower) {///ask doubt how?
		super(name, wheels, carColor);
		this.batteryPower=batteryPower;
	}
	
	public void details() {
		System.out.println("name:" + name);
		System.out.println("wheels:" +wheels);
		System.out.println("batteryPower:" +batteryPower);
	}
}

