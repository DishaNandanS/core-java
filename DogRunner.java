package Animal;

public class DogRunner {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setName("Golden Retriver");
		System.out.println(dog.getName());
		dog.setSound("bark");
		System.out.println(dog.getSound());
		dog.setNoOfLegs(4);
		System.out.println(dog.getNoOfLegs());
		//System.out.println(dog.name); //error becoz name is private in Animal class
		
	}

}
