import java.util.Scanner;

public class divide {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Enter numerator: ");
      int a = sc.nextInt();

      System.out.print("Enter denominator: ");
      int b = sc.nextInt();

      if (b == 0)
        throw new ArithmeticException("Cannot divide by zero!");

      System.out.println("Result: " + (a / b));
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    } finally {
      System.out.println("Cleanup complete.");
    }
  }
}
