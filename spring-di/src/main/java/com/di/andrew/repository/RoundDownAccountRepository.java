package com.di.andrew.repository;

import com.di.andrew.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class RoundDownAccountRepository implements AccountRepository {

    @Override
    public void credit(Account account, float creditAmount) {
        float newAmount = roundDown(account.getAmount() + creditAmount);
        account.setAmount(newAmount);
    }

    @Override
    public void debit(Account account, float debitAmount) {
        float newAmount = roundDown(account.getAmount() - debitAmount);
        account.setAmount(newAmount);
    }

    private float roundDown(float newAmount) {
        float newAmountRoundedDown = (float) Math.floor(newAmount);
        return newAmountRoundedDown;
    }
}
