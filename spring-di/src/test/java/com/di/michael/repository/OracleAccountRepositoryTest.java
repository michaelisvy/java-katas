package com.di.michael.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.di.michael.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OracleAccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void shouldCreditAmountSuccessfully() {
        Account account = new Account(10, 1000.0F);
        this.accountRepository.credit(account, 500.0F);

        assertThat(account.getBalance()).isEqualTo(1500F);
    }

    @Test
    public void shouldDebitAmountSuccessfully() {
        Account account = new Account(10, 1000.0F);
        this.accountRepository.debit(account, 500.0F);

        assertThat(account.getBalance()).isEqualTo(500F);
    }

}
