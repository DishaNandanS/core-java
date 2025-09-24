package com.abstractionInterface;

public class Currency {
	private String name;
	private int transferMoney;

	public Currency() {}

	public Currency(String name, int transferMoney) {
		this.name = name;
		this.transferMoney = transferMoney;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTransferMoney() {
		return transferMoney;
	}

	public void setTransferMoney(int transferMoney) {
		this.transferMoney = transferMoney;
	}
}
