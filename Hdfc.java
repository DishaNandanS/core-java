package com.abstractionInterface;

public class Hdfc implements Rbi {

    Currency currency;

    public Hdfc() {}

    public Hdfc(String name, int transferMoney) {
        this.currency = new Currency(name, transferMoney);
    }

    @Override
    public String manageDebt(String name, int transferMoney) {
        this.currency = new Currency(name, transferMoney);
        return this.currency.getName();
    }

    @Override
    public long CurrencyExchange() {
        return 98989899L; // Different exchange rate from Kbl
    }

    @Override
    public String validateIFSC(int value) {
        // Simulate logic: for even value return one IFSC, else another
        if (value % 2 == 0) {
            return "HDFC0001";
        } else {
            return "HDFC9999";
        }
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
