package com.thoughtworks.tddintro.accountbalance;

public class Account {
    private int balance;

    public Account(int startingBalance){
        balance = startingBalance;
    }

    public void deposit(int i) {
        balance += i;
    }

    public String getBalance() {
        return String.format("$%d", balance);
    }
}
