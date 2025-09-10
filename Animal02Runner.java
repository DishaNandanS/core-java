package UpCasting;

public class Animal02Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal02 cat = new Cat02();
		System.out.println("cat is a:" + cat.eat());
		System.out.println("no Of legs of a cat:" + cat.legs);
		
		Animal02 dog = new Dog02();
		System.out.println("dog is a:" + dog.eat());
		System.out.println("no Of legs of a dog:" + dog.legs);
		
		Animal02 elephant = new Elephant02();
		System.out.println("elephant is a:" + elephant.eat());
		System.out.println("no Of legs of a elephant:" + elephant.legs);
		
	}

}
