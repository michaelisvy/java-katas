package com.di.michael.repository;

import com.di.michael.model.Account;

public interface AccountRepository {

    void credit(Account account, float creditAmount);

    void debit(Account account, float debitAmount);
}
