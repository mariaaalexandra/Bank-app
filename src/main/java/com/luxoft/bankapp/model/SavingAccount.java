package com.luxoft.bankapp.model;

import com.luxoft.bankapp.exceptions.NotEnoughFundsException;

public class SavingAccount extends AbstractAccount {

    public SavingAccount() {
    }

    public SavingAccount(double initialBalance) {

        if (initialBalance >= 0) {
            setBalance(initialBalance);
        }
    }


    @Override
    public void withdraw(double amount) {

        if (getBalance() < amount) {
            throw new NotEnoughFundsException(amount);
        }

        setBalance(getBalance() - amount);
    }
}
