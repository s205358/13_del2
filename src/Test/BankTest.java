package Test;

import Game.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank(1000);

    @Test
    void deposit() {
        bank.setBalance(1000);
        bank.deposit(20);
        assertEquals(1020, bank.getBalance());
    }

    @Test
    void withdraw() {
        bank.setBalance(1000);
        bank.withdraw(20);
        assertEquals(980, bank.getBalance());
        bank.setBalance(1000);
        bank.withdraw(1020);
        assertEquals(0, bank.getBalance());
    }

    @Test
    void updateBalance() {
        bank.setBalance(1000);
        bank.updateBalance(20);
        assertEquals(1020, bank.getBalance());
        bank.setBalance(1000);
        bank.updateBalance(-20);
        assertEquals(980, bank.getBalance());
        bank.setBalance(1000);
        bank.updateBalance(-1020);
        assertEquals(0, bank.getBalance());
    }

    @Test
    void testToString() {
        bank.setBalance(1000);
        assertEquals("$1000", bank.toString());
    }
}