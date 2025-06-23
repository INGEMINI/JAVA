
//  Why Use FileReader?
// It is used to read text files (character by character).

// Good for reading ASCII or text content, not binary.

// Can read using:

// One character at a time

// Array of characters (buffered)

//  Constructors:
// Constructor...	Use
// FileReader(String filename)...	To read from a file name
// FileReader(File file)...	To read using File object

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("printwriter.txt");

      int ch;
      while ((ch = fr.read()) != -1) {
        System.out.print((char) ch); // Convert int to char
      }

      fr.close();
      System.out.println("\n✅ File read successfully!");

    } catch (IOException e) {
      System.out.println("🚨 Error reading file.");
      e.printStackTrace();
    }
  }
}
