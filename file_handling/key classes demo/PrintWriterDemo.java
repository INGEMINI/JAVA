
// Constructor	Purpose
// PrintWriter(String file)	Creates a writer for a file
// PrintWriter(FileWriter fw)	Wraps around FileWriter
// PrintWriter(String file, boolean append)	For appending

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriterDemo {
  public static void main(String[] args) {
    try {
      // 1️⃣ Basic PrintWriter (Overwrites file)
      PrintWriter pw1 = new PrintWriter("printwriter.txt");

      pw1.print("Mahi, you're doing great! ");
      pw1.println("This is a new line using println.");
      pw1.println(123); // Prints integer
      pw1.println(true); // Prints boolean

      pw1.flush(); // Optional, ensures writing
      pw1.close();

      // 2️⃣ Append mode using FileWriter
      FileWriter fw = new FileWriter("printwriter.txt", true);
      PrintWriter pw2 = new PrintWriter(fw);
      pw2.println("Appending this line to file.");
      pw2.printf("Formatted number: %.2f\n", 12.3456);
      pw2.close();

      System.out.println("✅ PrintWriter writing done!");

    } catch (IOException e) {
      System.out.println("🚨 Error occurred during PrintWriter operation.");
      e.printStackTrace();
    }
  }
}

// Feature...FileWriter... PrintWriter
// Formatting support... ❌... ✅ (with printf)
// print()/println()... ❌... ✅
// Handles types easily... ❌(you do manual convert)... ✅ (auto conversion)
