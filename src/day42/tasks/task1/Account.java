package day42.tasks.task1;

//1. create class Account with public fields: number, balance (do not create anything extra yet)

public class Account {
    private Currency currency;
    private String number;
    private double balance;

    public Account(Currency currency) {
        this.currency = currency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = currency + number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
