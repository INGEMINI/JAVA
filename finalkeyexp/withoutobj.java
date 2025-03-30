package finalkeyexp;

public class withoutobj {

  public static void main(String[] args) {
    final int MAX_VALUE = 100;
    System.out.println("The constant value is: " + MAX_VALUE);

    // MAX_VALUE = 200; // ❌ ERROR: Cannot assign a value to final variable

    final String MESSAGE = "Hello, World!";
    System.out.println(MESSAGE);

    // MESSAGE = "New Message"; // ❌ ERROR: Cannot modify final variable

  }

}
