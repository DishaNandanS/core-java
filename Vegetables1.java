package Vegetables;
//abstraction hw
//Create a abstract class with abstract method Provider implementation of abstract method in child class .
//In runner class create an object of child class and call the method
public abstract class Vegetables1 {
	private double noOfVege;
	
	public Vegetables1() {
	}
	public Vegetables1(double noOfVege) {
		this.noOfVege = noOfVege;
		}
	public double getNoOfVege() {
		return noOfVege;
	}
	public abstract float calculateProtein();
}
