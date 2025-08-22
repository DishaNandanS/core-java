package Vehicle;

public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus bus = new Bus();
		bus.getBusInfo();
		
		System.out.println("-----------------------");
		Bus bus2 = new Bus("BMTC", 6, 8989, true);
		bus2.getBusInfo();
		
		System.out.println("-----------------------");

		Bus bus3 = new Bus("Airavata", 6, 1689, false);
		bus3.getBusInfo();
		
		System.out.println("-----------------------");

		Bus bus4 = new Bus("sleeper", 6, 8345, false);
		bus4.getBusInfo();
	}

}
