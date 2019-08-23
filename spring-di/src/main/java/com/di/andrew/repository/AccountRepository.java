package com.di.andrew.repository;

import com.di.andrew.model.Account;

public interface AccountRepository {

    void credit(Account account, float creditAmount);

    void debit(Account account, float debitAmount);
}
