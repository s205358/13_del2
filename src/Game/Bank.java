package Game;


public class Bank {
    public class BankAccount {
        private int balance;

        public void withdraw(int amountToWithdraw) {
            if ((balance - amountToWithdraw) >= 0) {
                updateBalance(-amountToWithdraw);
            }else{
                updateBalance(-balance);
            }
        }

        public void deposit(int amountToDeposit) {
            updateBalance(amountToDeposit);
        }

        private void updateBalance(int amount) {
            balance = balance + amount;						//add or subtract amount from balance.
        }

        public String getBalance() {
            return "Bank.BankAccount [balance=" + balance + "]";
        }

        @Override
        public String toString() {
            return "Bank.BankAccount [balance=" + balance + "]";
        }

    }


}
