package UpCasting;

public class Animal01Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal01 cat = new Cat01();
		System.out.println("cat is a:" + cat.eat());
		System.out.println("no Of legs of a cat:" + cat.legs);
		
		Animal01 dog = new Dog01();
		System.out.println("dog is a:" + dog.eat());
		System.out.println("no Of legs of a dog:" + dog.legs);
		
		Animal01 elephant = new Elephant01();
		System.out.println("elephant is a:" + elephant.eat());
		System.out.println("no Of legs of a elephant:" + elephant.legs);
		
	}

}
