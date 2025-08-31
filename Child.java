package SingleParent;

public class Child extends Mother{

	int age;
	
	public Child() {
		
	}
	public Child(String Name, int child, int age) {
		super(Name, child);
		this.age=age;
	}
	public void singleParentDetails() {
		System.out.println(Name);
		System.out.println(child);
		System.out.println(age);
	}
}
