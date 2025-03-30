package parseint;

// Converting a String with a Different Base (Radix)

public class adv {

  public static void main(String[] args) {
    String binaryString = "1010";
    int decimalValue = Integer.parseInt(binaryString, 2); // Converts binary "1010" to decimal
    System.out.println("Binary 1010 in decimal: " + decimalValue);
  }
}
