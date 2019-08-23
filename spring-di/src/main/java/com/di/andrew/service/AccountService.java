package com.di.andrew.service;

import com.di.andrew.model.Account;
import com.di.andrew.repository.AccountRepository;
import com.di.andrew.repository.RoundDownAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository = new RoundDownAccountRepository();

    public void transfer(Account sourceAccount, Account destinationAccount, float amount) {
         accountRepository.debit(sourceAccount, amount);
         accountRepository.credit(destinationAccount, amount);
    }
}
