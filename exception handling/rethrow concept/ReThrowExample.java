public class ReThrowExample {
  public static void method() throws Exception {
    try {
      int result = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Logging error: " + e.getMessage());
      throw e; // re-throw to caller
    }
  }

  public static void main(String[] args) throws Exception {
    try {
      method();
    } catch (ArithmeticException e) {
      System.out.println("Caught in main: " + e.getMessage());
    }
  }
}
