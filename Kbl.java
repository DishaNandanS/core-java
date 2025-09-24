package com.abstractionInterface;

public class Kbl implements Rbi {

	Currency currency;

	public Kbl() {}

	public Kbl(String name, int transferMoney) {
		this.currency = new Currency(name, transferMoney);
	}

	@Override
	public String manageDebt(String name, int transferMoney) {
		this.currency = new Currency(name, transferMoney);
		return this.currency.getName();
	}

	@Override
	public long CurrencyExchange() {
		return 65762898L;
	}

	@Override
	public String validateIFSC(String value) {
		// You can use value to validate in future
		currency.setBal(currency.getBal() + currency);
		return value;
	}

	public String getName() {
		if (currency != null) {
			return currency.getName();
		}
		return null;
	}

	public int getTransferMoney() {
		if (currency != null) {
			return currency.getTransferMoney();
		}
		return 0;
	}
}
