package Vehicle;

public class Car extends Vehicle {

	public String name;
	
	public void automobileDetails() {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		System.out.println("--------------------");
		name = "BMW";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println("--------------------");

		super.name = "Ferrari";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		}
}
