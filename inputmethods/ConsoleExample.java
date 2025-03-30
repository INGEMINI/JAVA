package inputmethods;

import java.io.Console; // Import Console class

public class ConsoleExample {
  public static void main(String[] args) {
    Console console = System.console(); // Get system console

    // Check if console is available (not in IDEs)
    if (console == null) {
      System.out.println("No console available. Run from the terminal.");
      return;
    }

    // Taking String input
    String name = console.readLine("Enter your name: ");

    // Taking Password input (masked, does not show while typing)
    char[] passwordArray = console.readPassword("Enter your password: ");
    String password = new String(passwordArray); // Convert char[] to String

    // Displaying data (never print passwords in real applications)
    System.out.println("\n===== User Details =====");
    System.out.println("Name: " + name);
    System.out.println("Password: " + password);
  }
}
