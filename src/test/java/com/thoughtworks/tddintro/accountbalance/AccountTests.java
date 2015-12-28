package com.thoughtworks.tddintro.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        // Arrange
        Account testAccount = new Account(100);

        // Act
        testAccount.deposit(50);

        // Assert
        assertThat(testAccount.getBalance(), is("$150"));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account testAccount = new Account(100);
        testAccount.withdraw(50);
        assertThat(testAccount.getBalance(), is("$50"));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account testAccount = new Account(50);
        testAccount.withdraw(100);
        assertThat(testAccount.getBalance(), is("$50"));
    }
}
