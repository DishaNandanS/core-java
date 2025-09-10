package upcasting1;

public class Laptop11Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop11 laptop = new Laptop11();
		System.out.println("quantity of some laptops:" + laptop.quantity);
		System.out.println("total price of laptops:" + laptop.calculatePrice());
		System.out.println("-----------------------------------------------------");
		
		Laptop11 dell = new Dell11(878675);
		System.out.println("quantity of dell:" + dell.quantity);
		System.out.println("total price of dell:" + dell.calculatePrice());
		System.out.println("-----------------------------------------------------");

		Laptop11 hp = new HP11(989876);
		System.out.println("quantity of hp:" + hp.quantity);
		System.out.println("totalPrice of hp:" + hp.calculatePrice());
		System.out.println("-----------------------------------------------------");

		Laptop11 lenevo = new Lenevo11(76757);
		System.out.println("quantity of lenevo:" + lenevo.quantity);
		System.out.println("totalPrice of lenovo:" + lenevo.calculatePrice());
	}

}
