package com.bridgelabz.oops;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0.0) {
            balance = initialBalance;
        } else {
            balance = 0.0;
        }
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
