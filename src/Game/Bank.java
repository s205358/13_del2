package Game;

public class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public void deposit(int cash) {
        this.balance += cash;
    }

    public void withdraw(int cash) {
        cash = Math.abs(cash);
        if (balance > cash) {
            this.balance -= cash;
        } else {
            this.balance = 0;
        }
    }

    public void updateBalance(int cash) {
        if (cash < 0) {
            withdraw(cash);
        } else if (cash > 0) {
            deposit(cash);
        } else {
            // do nothing
        }
    }

    // Getters/Setters
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Stringify
    @Override
    public String toString() {
        return "$" + balance;
    }
}
