class LowBalanceException extends Exception {
  LowBalanceException(String msg) {
    super(msg);
  }
}

public class Main {
  static void withdraw(int balance, int amount) throws LowBalanceException {
    if (amount > balance)
      throw new LowBalanceException("Insufficient balance");
    else
      System.out.println("Withdrawal successful! Remaining: " + (balance - amount));
  }

  public static void banking(String[] args) {
    try {
      withdraw(1000, 1500);
    } catch (LowBalanceException e) {
      System.out.println("Transaction Failed: " + e.getMessage());
    }
  }
}
