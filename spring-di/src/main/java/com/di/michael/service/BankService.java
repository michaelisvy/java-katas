package com.di.michael.service;

import com.di.michael.model.Account;
import com.di.michael.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    private AccountRepository accountRepository;


    public void transfer(Account sourceAccount, Account destinationAccount, float amount) {
        accountRepository.debit(sourceAccount, amount);
        accountRepository.credit(destinationAccount, amount);
    }
}
