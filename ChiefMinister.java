package President;

public class ChiefMinister extends PrimeMinister {

	private double salary;
	
	public ChiefMinister() {}
	public ChiefMinister(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void ministerInfo() {
		System.out.println("name:" + name);
		System.out.println("salary:" + salary);
	}
}
