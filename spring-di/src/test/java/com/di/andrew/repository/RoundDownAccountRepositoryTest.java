package com.di.andrew.repository;

import com.di.andrew.model.Account;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RoundDownAccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void shouldCreditSuccessfully() {
        Account account = new Account(10.0F);
        float creditAmount = 100.5F;

        accountRepository.credit(account, creditAmount);

        assertThat(account.getAmount()).isEqualTo(110.0F);
    }

    @Test
    public void shouldDebitSuccessfully() {
        Account account = new Account(110.0F);
        float debitAmount = 10.5F;

        accountRepository.debit(account, debitAmount);

        assertThat(account.getAmount()).isEqualTo(99.0F);
    }
}
