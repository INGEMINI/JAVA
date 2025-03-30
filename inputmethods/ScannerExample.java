package inputmethods;

import java.util.Scanner; // Import Scanner class

public class ScannerExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create Scanner object

    System.out.print("Enter an integer: ");
    int num = sc.nextInt(); // Read an integer

    sc.nextLine(); // Fix for nextLine() issue

    System.out.print("Enter a sentence: ");
    String text = sc.nextLine(); // Read a full sentence

    System.out.print("Enter a decimal number: ");
    double decimal = sc.nextDouble(); // Read a double

    System.out.print("Enter a single word: ");
    String word = sc.next(); // Read a single word

    System.out.println("\nYou Entered:");
    System.out.println("Integer: " + num);
    System.out.println("Sentence: " + text);
    System.out.println("Decimal: " + decimal);
    System.out.println("Word: " + word);

    sc.close(); // Close Scanner
  }
}
