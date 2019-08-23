package com.di.andrew.service;

import static org.assertj.core.api.Assertions.assertThat;
import com.di.andrew.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void shouldTransferAmountSuccessfully() {
        Account sourceAccount = new Account(100.0F);
        Account destinationAccount = new Account(10.0F);

        float amount = 10.0F;
        accountService.transfer(sourceAccount, destinationAccount, amount);

        assertThat(sourceAccount.getAmount()).isEqualTo(90.0F);
        assertThat(destinationAccount.getAmount()).isEqualTo(20.0F);
    }
}
