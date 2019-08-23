package com.di.michael.repository;

import com.di.michael.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class OracleAccountRepository implements AccountRepository {
    @Override
    public void credit(Account account, float creditAmount) {
        float newAmount = roundDown(account.getBalance() + creditAmount);
        account.setBalance(newAmount);
    }

    @Override
    public void debit(Account account, float debitAmount) {
        float newAmount = roundDown(account.getBalance() - debitAmount);
        account.setBalance(newAmount);
    }

    private float roundDown(float newAmount) {
        float newAmountRoundedDown = (float) Math.floor(newAmount);
        return newAmountRoundedDown;
    }
}
