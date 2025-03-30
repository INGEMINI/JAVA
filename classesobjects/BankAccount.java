package classesobjects;

class BankAccount {
    private double balance;

    // Constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit money
    void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public class Main {
        public static void main(String[] args) {
            BankAccount myAccount = new BankAccount(1000);
            myAccount.deposit(500);
            myAccount.withdraw(200);
            myAccount.displayBalance();
        }
    }
}