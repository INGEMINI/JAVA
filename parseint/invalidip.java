package parseint;
//handling invalid input

public class invalidip {

  public static void main(String[] args) {
    String invalidNumber = "12A3"; // Not a valid number

    try {
      int num = Integer.parseInt(invalidNumber);
      System.out.println("Converted number: " + num);
    } catch (NumberFormatException e) {
      System.out.println("Error: Invalid number format!");
    }

  }

}
