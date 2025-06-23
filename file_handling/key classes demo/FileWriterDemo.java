
//2 types of Constructor...	Description
// FileWriter(String filename)...Creates/opens file, overwrites existing content.
// FileWriter(String filename, true)...Opens file in append mode.

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
  public static void main(String[] args) {
    try {
      // 1️⃣ Overwrite mode (default)
      FileWriter fw1 = new FileWriter("example1.txt");
      fw1.write("Hello Mahi!\n");
      fw1.write("This is overwrite mode.\n");
      fw1.close(); // Always close to save and release

      // 2️⃣ Append mode
      FileWriter fw2 = new FileWriter("example1.txt", true);
      fw2.write("Now this is appended text.\n");
      fw2.write("Let's learn Java file handling like a pro!\n");
      fw2.close();

      // 3️⃣ Writing using char array
      FileWriter fw3 = new FileWriter("example2.txt");
      char[] data = { 'J', 'a', 'v', 'a', ' ', '♥' };
      fw3.write(data);

      fw3.flush();
      fw3.close();

      System.out.println("✅ Writing completed successfully!");

    } catch (IOException e) {
      System.out.println("🚨 An error occurred during writing.");
      e.printStackTrace();
    }
  }
}
