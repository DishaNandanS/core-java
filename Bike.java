package Vehicle;

public class Bike extends Vehicle {

	public String name;
	private int noOfWheels;
	private float price;
	
	public Bike() {
		
	}
	
	public Bike(String name, int noOfWheels, float price) {
		this.name=name;
		
		this.noOfWheels=noOfWheels;
		this.price = price;
		
	}
	public void bikeDetails() {
		System.out.println("Bike name-" + this.name);
		System.out.println("Bike wheels-" + this.noOfWheels);
		System.out.println("Bike price-" + this.price);
	}
}
