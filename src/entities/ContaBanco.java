package entities;

import java.util.Locale;

public class ContaBanco {
    private final int number;
    private String holder;
    private double balance;

    private static final double WITHDRAW_FEE = 5.0;

    public ContaBanco(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public ContaBanco(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        balance -= (amount + WITHDRAW_FEE);
    }

    @Override
    public String toString() {
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " 
                + String.format(Locale.US, "%.2f", balance);
    }
}
