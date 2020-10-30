package Test;

import Game.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank(1000);

    @Test
    void deposit() {
        bank.deposit(20);
        assertEquals(1020, bank.getBalance());
    }

    @Test
    void withdraw() {
        bank.withdraw(20);
        assertEquals(980, bank.getBalance());
        bank.withdraw(1000);
        assertEquals(0, bank.getBalance());
    }

    @Test
    void updateBalance() {
        bank.updateBalance(20);
        assertEquals(1020, bank.getBalance());
        bank.updateBalance(-20);
        assertEquals(1000, bank.getBalance());
        bank.updateBalance(-1020);
        assertEquals(0, bank.getBalance());
    }

    @Test
    void testToString() {
        assertEquals("$1000", bank.toString());
    }
}