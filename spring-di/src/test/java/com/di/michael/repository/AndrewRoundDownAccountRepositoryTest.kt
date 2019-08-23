package com.di.michael.repository

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import com.di.michael.model.Account

import org.assertj.core.api.Assertions.assertThat
import java.util.*


private fun hello() = "hello"
fun String.save() = ""


@RunWith(SpringRunner::class)
@SpringBootTest
class AndrewRoundDownAccountRepositoryTest {

    @Autowired
    private lateinit var accountRepository: AccountRepository?

    fun String.toNumber() = Integer.parseInt(this)


    @Test
    fun shouldCreditSuccessfully() {
        val account = Account(10, 10.0f)
        val creditAmount = 100.5f
        val someThing = accountRepository ?: return


        assertThat(account.balance).isEqualTo(110.0f)
    }

    @Test
    fun shouldDebitSuccessfully() {
        val account = Account(10, 110.0f)
        val debitAmount = 10.5f

        accountRepository!!.debit(account, debitAmount)

        assertThat(account.balance).isEqualTo(99.0f)
    }
}


class Hello {
    fun something() {
        "".save()

        mapOf(1 to 2, 3 to 4)[1]


        HashMap<Int,Int>().apply {
            put(1, 2)
            put(1, 3)
        }
    }
}