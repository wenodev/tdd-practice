package test;

import main.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(100);
    }

    @Test
    public void testAccount() throws Exception {
        if (account == null){
            fail("fail");
        }
    }

    @Test
    public void testGetBalance(){
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testDeposit(){
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }


}
