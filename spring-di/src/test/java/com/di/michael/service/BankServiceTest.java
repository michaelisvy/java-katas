package com.di.michael.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.di.michael.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankServiceTest {

    @Autowired
    private BankService bankService;

    @Test
    public void shouldTransferSuccessfully() {
        Account sourceAccount = new Account(10, 1000.0F);
        Account destinationAccount = new Account(20, 100.0F);

        bankService.transfer(sourceAccount, destinationAccount, 100.0F);
        assertThat(sourceAccount.getBalance()).isEqualTo(900.0F);
        assertThat(destinationAccount.getBalance()).isEqualTo(200.0F);
    }
}
