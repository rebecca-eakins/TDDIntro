package com.thoughtworks.tddintro.accountbalance;

public class Account {
    private int balance;

    public Account(int startingBalance) {
        balance = startingBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) return;
        balance -= amount;
    }

    public String getBalance() {
        return String.format("$%d", balance);
    }
}
