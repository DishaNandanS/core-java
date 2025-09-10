package UpCasting;

public class Animal00Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal00 cat = new Cat00();
		System.out.println("cat is a:" + cat.eat());
		System.out.println("no Of legs of a cat:" + cat.legs);
		
		Animal00 dog = new Dog00();
		System.out.println("dog is a:" + dog.eat());
		System.out.println("no Of legs of a dog:" + dog.legs);
		
		Animal00 elephant = new Elephant00();
		System.out.println("elephant is a:" + elephant.eat());
		System.out.println("no Of legs of a elephant:" + elephant.legs);
		
	}

}
