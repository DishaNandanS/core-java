package Vehicle2;
//multi level inheritance
public class Vehicle2 {

	public String name;
	int wheels;
	
	public Vehicle2() {
		
	}
	public Vehicle2(String name, int wheels) {
		this.name=name;
		this.wheels=wheels;
	}
	public void details() {
		
		System.out.println("1:" + name + "2:" + wheels);
	}
}
