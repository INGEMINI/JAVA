package inputmethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
  public static void main(String[] args) {
    // Try-with-resources ensures BufferedReader is closed automatically
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

      // 1. Reading a single line as a String
      System.out.print("Enter your name: ");
      String name = reader.readLine(); // Reads a whole line of text

      // 2. Reading an Integer
      System.out.print("Enter your age: ");
      int age = Integer.parseInt(reader.readLine()); // Converts String to int

      // 3. Reading a Double
      System.out.print("Enter your height (in meters): ");
      double height = Double.parseDouble(reader.readLine()); // Converts String to double

      // 4. Reading multiple values from a single line using StringTokenizer
      System.out.print("Enter three space-separated numbers: ");
      String inputLine = reader.readLine(); // Read the whole line

      // Using StringTokenizer to split input into tokens
      StringTokenizer tokenizer = new StringTokenizer(inputLine);
      int num1 = Integer.parseInt(tokenizer.nextToken()); // First number
      int num2 = Integer.parseInt(tokenizer.nextToken()); // Second number
      int num3 = Integer.parseInt(tokenizer.nextToken()); // Third number

      // 5. Reading multiple lines
      System.out.println("Enter two lines of text:");
      String line1 = reader.readLine(); // Read first line
      String line2 = reader.readLine(); // Read second line

      // 6. Displaying all collected input
      System.out.println("\n===== User Details =====");
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Height: " + height + " meters");

      System.out.println("\n===== Numbers Entered =====");
      System.out.println("First Number: " + num1);
      System.out.println("Second Number: " + num2);
      System.out.println("Third Number: " + num3);

      System.out.println("\n===== Multi-line Input =====");
      System.out.println("Line 1: " + line1);
      System.out.println("Line 2: " + line2);

    } catch (IOException e) { // Handle any I/O errors
      System.out.println("Error reading input: " + e.getMessage());
    } catch (NumberFormatException e) { // Handle incorrect number format errors
      System.out.println("Invalid number format. Please enter valid integers or doubles.");
    }
  }
}
