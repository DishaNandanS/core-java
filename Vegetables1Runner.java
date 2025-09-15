package Vegetables;

import firstProgram.Circle;

public class Vegetables1Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carrot1 car = new Carrot1(50);
		Onion1 oni = new Onion1("Round");
		
		System.out.println("Carrot Protein: " + car.calculateProtein());
        System.out.println("Onion Protein: " + oni.calculateProtein());
		
	}

}
