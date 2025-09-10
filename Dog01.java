package UpCasting;

public class Dog01 extends Animal01 {

public Dog01() {
		
	}
	public Dog01(int legs) {
		this.legs=legs;
	}
	public String eat() {
		return "Omnivore";
	}
}
