public class concepts {
  public static void main(String[] args) {
    try {
      int a = 5 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Caught: " + e); // uses toString()
      System.out.println("Message: " + e.getMessage()); // / by zero
      e.printStackTrace(); // full stack trace
    } finally {
      System.out.println("This is always executed.");
    }
  }
}
