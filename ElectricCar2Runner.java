package Vehicle2;

public class ElectricCar2Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 car = new Car2("Audi", 4, "Blue");
		car.details();
		
		System.out.println("=======================");
		
		ElectricCar2 car2 = new ElectricCar2("Mahindra", 4, "Black", 99.58f);
		car2.details();
		
		System.out.println("=======================");

		Vehicle2 vehicle = new Vehicle2("Jeep", 4);
		vehicle.details();
	}

}
