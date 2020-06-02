package day48.tasks.task1;

import day42.tasks.task1.Currency;

public abstract class Bank {
    private String name;
    private String address;
    private String email;
    private String phone;
    private double balance;
    private Currency currency;

    abstract double exchange(double amount, Currency currency);

    //withdraw and deposit
    public void withdraw(double amount) {
        //balance is less than amount, assuming bank doesnt allow negative balance
        if(balance < amount) {
            throw new RuntimeException("cant withdraw " + currency.getSymbol() + amount + ", balance is: " + currency.getSymbol() + balance);
        }

        balance -= amount;
    }

    public void deposit(double amount) {
        if(amount > 5000) {
            throw new RuntimeException(currency.getSymbol() + "" + amount + " exceeds daily deposit limit, Please visit your bank clerk");
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return "Bank" +
                "\nname='" + name +
                "\naddress='" + address +
                "\nemail='" + email +
                "\nphone='" + phone +
                "\nbalance=" + balance +
                "\ncurrency=" + currency;
    }
}
