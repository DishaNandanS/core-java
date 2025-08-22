package Vehicle;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike bike = new Bike();
		bike.bikeDetails();
		
		System.out.println("====================");
		Bike bike1 = new Bike("Hounda", 2, 77.8f);
	//bike1.bikeDetails("R15", 2, 99.22); //mistake
		bike1.bikeDetails();
		
		System.out.println("====================");
		Bike bike2 = new Bike("Royal Enfied", 2, 99.88f);
		bike2.bikeDetails();
	}

}
