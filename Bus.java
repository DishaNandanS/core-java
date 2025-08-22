package Vehicle;

public class Bus extends Vehicle{

	public String name;//can we write this?doubt
	private int wheels;
	private int numberBoard;
	private boolean lugageSpace;
	
	public Bus() {}
	
	public Bus(String name, int wheels, int numberBoard, boolean lugageSpace) {
		this.name=name;
		this.wheels=wheels;
		this.numberBoard=numberBoard;
		this.lugageSpace=lugageSpace;
	}
	
	public void getBusInfo() {
		System.out.println("bus name-" +this.name);
		System.out.println("bus wheels-" +this.wheels);
		System.out.println("bus board-" +this.numberBoard);
		System.out.println("bus space-" +this.lugageSpace);
	}
}
