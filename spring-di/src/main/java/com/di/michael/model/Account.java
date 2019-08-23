package com.di.michael.model;

public class Account {

    private Integer accountId;
    private Float balance;

    public Account() {
    }

    public Account(Integer accountId, Float balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
