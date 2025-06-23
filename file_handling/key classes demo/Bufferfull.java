import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bufferfull {
  public static void main(String[] args) {
    BufferedReader fileReader = null;
    BufferedReader consoleReader = null;

    try {
      // ----------- Step 1: Read from file -------------
      System.out.println("Reading from file 'data.txt':");
      fileReader = new BufferedReader(new FileReader("data.txt"));
      String line;

      while ((line = fileReader.readLine()) != null) {
        System.out.println(line);
      }

      // ----------- Step 2: Read from console -------------
      consoleReader = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("\nNow enter your name:");
      String name = consoleReader.readLine(); // full line

      System.out.println("Enter your age:");
      int age = Integer.parseInt(consoleReader.readLine());

      System.out.println("Enter any single character:");
      int ch = consoleReader.read(); // reads one character (ASCII)
      consoleReader.readLine(); // clear the leftover newline after read()

      System.out.println("Input Ready? " + consoleReader.ready());

      // ----------- Output -------------
      System.out.println("\n--- Console Output ---");
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Character you entered (char): " + (char) ch);

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      try {
        if (fileReader != null)
          fileReader.close();
        if (consoleReader != null)
          consoleReader.close();
      } catch (IOException e) {
        System.out.println("Error closing reader: " + e.getMessage());
      }
    }
  }
}
