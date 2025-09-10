package UpCasting;

public class Animal0Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal0 cat = new Cat0();
		System.out.println("cat is a:" + cat.eat());
		System.out.println("no Of legs of a cat:" + cat.legs);
		
		Animal0 dog = new Dog0();
		System.out.println("dog is a:" + dog.eat());
		System.out.println("no Of legs of a dog:" + dog.legs);
		
		Animal0 elephant = new Elephant0();
		System.out.println("elephant is a:" + elephant.eat());
		System.out.println("no Of legs of a elephant:" + elephant.legs);
		
	}

}
