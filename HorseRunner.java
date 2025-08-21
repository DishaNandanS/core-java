package Animal;

public class HorseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse horse = new Horse();
		horse.setName("Eclipse");
		System.out.println(horse.getName());
		horse.setSound("Neigh");
        horse.setNoOfLegs(4);
        System.out.println(horse.getSound());
        System.out.println(horse.getNoOfLegs());
		
	}

}
