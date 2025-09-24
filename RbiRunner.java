package com.abstractionInterface;

public class RbiRunner {

	public static void main(String[] args) {
		Rbi rbi = new Kbl();

		rbi.manageDebt("Amit", 5000);
		System.out.println("Currency Exchange Rate: " + rbi.CurrencyExchange());
		System.out.println("IFSC Code: " + rbi.validateIFSC(1234));

		// Downcast to access Kbl-specific methods
		if (rbi instanceof Kbl) {
			Kbl kbl = (Kbl) rbi;
			System.out.println("Name: " + kbl.getName());
			System.out.println("Transferred Amount: " + kbl.getTransferMoney());
		}
	}
}
