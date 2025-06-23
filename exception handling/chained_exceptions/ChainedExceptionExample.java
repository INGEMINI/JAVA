public class ChainedExceptionExample {

  static void lowLevel() throws Exception {
    throw new Exception("Low-level failure");
  }

  static void midLevel() throws Exception {
    try {
      lowLevel();
    } catch (Exception e) {
      throw new Exception("Mid-level error occurred", e); // chaining
    }
  }

  public static void main(String[] args) {
    try {
      midLevel();
    } catch (Exception e) {
      System.out.println("Caught: " + e.getMessage());
      System.out.println("Cause: " + e.getCause());
    }
  }
}
