package Animal;

public class ElephantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elephant elephant = new Elephant();
		elephant.setName("Arjuna");
		System.out.println(elephant.getName());
		 elephant.setSound("Trumpet");
	        elephant.setNoOfLegs(4);
	        System.out.println(elephant.getSound());
	        System.out.println(elephant.getNoOfLegs());

		}

}
