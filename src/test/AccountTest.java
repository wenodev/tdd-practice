package test;


import main.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(1000);
    }

    @Test
    public void testGetBalance(){
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testDeposit(){
        account.deposit(100);
        assertEquals(1100, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        account.withdraw(100);
        assertEquals(900, account.getBalance());
    }

}
